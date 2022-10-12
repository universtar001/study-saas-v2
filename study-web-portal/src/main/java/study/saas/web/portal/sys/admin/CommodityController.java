package study.saas.web.portal.sys.admin;

import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import study.saas.common.util.CopyClassUtil;
import study.saas.common.viewmodel.ApiResultV2;
import study.saas.order.entity.Commodity;
import study.saas.order.service.CommodityFacade;
import study.saas.order.service.model.*;


/**
 * @author WMX
 */
@Api(tags = "商品管理")
@RestController
@RequestMapping(value = "sys/commodity")
public class CommodityController {
    @Reference(version = "1.0.0")
    private CommodityFacade commodityFacade;


    //查询商品情况
    @ApiOperation(value = "获取")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ApiResultV2<Commodity>findCommodity(String commodityName) {
        if (commodityName == null ) {
            return ApiResultV2.error("数据不能为空！");
        }

        return commodityFacade.findCommodity(commodityName);
    }


    //添加商品
    @ApiOperation(value = "创建")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ApiResultV2 create(CommodityCreateDTO create) {
        if (create == null) {
            return ApiResultV2.error("数据不能为空！");
        }
        return commodityFacade.addCommodity(create);
    }

    //删除商品
    @ApiOperation(value = "删除商品")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    ApiResultV2 deleteCommodity(String commodityName) {
        if (commodityName == null) {
            return ApiResultV2.error("数据不能为空！");
        }
        return commodityFacade.deleteCommodity(commodityName);
    }


    //修改商品和上下架
    @ApiOperation(value = "修改")
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public ApiResultV2 modify(CommodityModifyDTO modify) {
        if (modify == null) {
            return ApiResultV2.error("数据不能为空！");
        }
        Commodity commodity = commodityFacade.findCommodity(modify.getCommodityName()).getData();
        if (commodity.isDelete()||commodity == null) {
            return ApiResultV2.error("商品不存在");
        }
        CommodityDecreaseDTO commodityDecreaseDTO = new CommodityDecreaseDTO();
        CopyClassUtil.copyClass(commodity,commodityDecreaseDTO);
        commodityDecreaseDTO.setAmount(commodityDecreaseDTO.getAmount()-modify.getAmount());
        commodityDecreaseDTO.setStatus(commodityDecreaseDTO.getStatus());
        if (commodityDecreaseDTO.getAmount()<0){
            return ApiResultV2.error("商品库存不足");
        }
        return commodityFacade.decreaseCommodity(commodityDecreaseDTO);

    }

    //分页查询
    @ApiOperation(value = "分页查询")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ApiResultV2 list(CommodityFilterDTO filter) {
        if (filter == null) {
            return ApiResultV2.error("数据不能为空！");
        }
        return commodityFacade.list(filter);
    }



}
