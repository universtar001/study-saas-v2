package study.saas.order.service;

import org.springframework.stereotype.Service;
import study.saas.common.entity.YPageable;
import study.saas.common.repo.Repo;
import study.saas.common.util.CopyClassUtil;
import study.saas.common.util.PageUtils;
import study.saas.common.util.StringUtil;
import study.saas.common.viewmodel.ApiResultV2;
import study.saas.common.viewmodel.PageModel;
import study.saas.order.entity.Commodity;
import study.saas.order.repo.CommodityRepo;
import study.saas.order.service.model.CommodityCreateDTO;
import study.saas.order.service.model.CommodityDecreaseDTO;
import study.saas.order.service.model.CommodityFilterDTO;
import study.saas.order.service.model.CommodityModifyDTO;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author WMX
 */
@Service
public class CommodityService {

    @Resource
    private CommodityRepo commodityRepo;
    /**
     * 查询商品
     */
    public ApiResultV2<Commodity> findCommodity(String commodityName) {
        Commodity commodity = commodityRepo.findByCommodityName(commodityName);
        if (commodity != null && commodity.isDelete()) {
            commodity = null;
        }
        return ApiResultV2.ok(commodity);
    }
    /**
     * 增加商品
     */
    public ApiResultV2 addCommodity(CommodityCreateDTO create) {
        Commodity commodity = commodityRepo.findByCommodityName(create.getCommodityName());
        if (commodity != null && !commodity.isDelete()) {
            return ApiResultV2.error("id重复");
        }
        Commodity newCommodity;
        if (commodity == null) {
            newCommodity = new Commodity();
        } else {
            newCommodity = commodity;
            newCommodity.setIsDeleted(0);
        }
        CopyClassUtil.copyClass(create, newCommodity);
        commodityRepo.save(newCommodity);
        return ApiResultV2.ok();
    }
    /**
     * 删除商品
     */
    public ApiResultV2 deleteCommodity(String commodityName) {
        Commodity commodity = commodityRepo.findByCommodityName(commodityName);
        if (commodity == null || commodity.isDelete()) {
            return ApiResultV2.ok();
        }
        commodity.setIsDeleted(1);
        commodityRepo.save(commodity);
        return ApiResultV2.ok();
    }

    /**
     * 修改商品数量
     */
    public ApiResultV2 modify(CommodityModifyDTO modify) {
        Commodity commodity = commodityRepo.findByCommodityName(modify.getCommodityName());
        if (commodity == null || commodity.isDelete()) {
            return ApiResultV2.error("商品不存在");
        }
        CopyClassUtil.copyClass(modify, commodity);
        commodityRepo.save(commodity);
        return ApiResultV2.ok();
    }
    /**
     * 分页查询
     */
    public ApiResultV2<PageModel<Commodity>> list(CommodityFilterDTO filter) {
        YPageable pageable = PageUtils.Ypageable(filter.getPage(), filter.getPageSize());
        StringBuilder sql = new StringBuilder();
        Map<String, Object> param = new HashMap<>();
        sql.append(" select c from Commodity c where c.isDeleted = 0 ");
        if (!StringUtil.isEmpty(filter.getCommodityName())) {
            sql.append(" and c.commodityName = :getCommodityName");
            param.put("getCommodityName", filter.getCommodityName());
        }
        if (!StringUtil.isEmpty(filter.getCommodityLike())) {
            sql.append(" and c.commodityLike like :getCommodityLike");
            param.put("getCommodityLike", "%" + filter.getCommodityLike() + "%");
        }
        sql.append(" order by c.createTime desc,uuid desc ");
        pageable.setCountSql(Repo.toCountJPql(sql.toString()));
        PageModel<Commodity> pageModel = commodityRepo.queryPage(sql.toString(), param, Commodity.class, pageable);
        return ApiResultV2.ok(pageModel);
    }

    /**
     * 库存变动和商品上下架
     */
    public ApiResultV2 decreaseCommodity(CommodityDecreaseDTO amount) {
        Commodity commodity = commodityRepo.findByCommodityName(amount.getCommodityName());
        CopyClassUtil.copyClass(amount, commodity);
        commodityRepo.save(commodity);
        return ApiResultV2.ok(amount);
    }
}