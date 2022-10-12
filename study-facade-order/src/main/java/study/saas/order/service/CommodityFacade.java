package study.saas.order.service;

import study.saas.common.facade.BaseFacade;
import study.saas.common.viewmodel.ApiResultV2;
import study.saas.common.viewmodel.PageModel;
import study.saas.order.entity.Commodity;
import study.saas.order.service.model.CommodityCreateDTO;
import study.saas.order.service.model.CommodityDecreaseDTO;
import study.saas.order.service.model.CommodityFilterDTO;
import study.saas.order.service.model.CommodityModifyDTO;

/**
 * @author WMX
 */
public interface CommodityFacade extends BaseFacade<Commodity>{
    /**
     * 查询商品详情
     */
    ApiResultV2<Commodity> findCommodity(String commodityName);

    /**
     * 添加商品
     */
    ApiResultV2 addCommodity(CommodityCreateDTO create);

    /**
     * 删除商品
     */

    ApiResultV2 deleteCommodity(String commodityName);

    /**
     * 修改商品数量
     *
     */
    ApiResultV2 modify(CommodityModifyDTO modify);

    /**
     * 分页查询列表
     *
     * @param filter 过滤条件
     * @return 返回操作结果
     */
    ApiResultV2<PageModel<Commodity>> list(CommodityFilterDTO filter);

    /**
     * 商品上下库
     *
     */
    ApiResultV2<Commodity> decreaseCommodity(CommodityDecreaseDTO Status);
}
