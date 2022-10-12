package study.saas.order.repo;

import study.saas.common.repo.BaseRepoV2;
import study.saas.order.entity.Commodity;

public interface CommodityRepo extends BaseRepoV2<Commodity, String> {

    Commodity findByCommodityName(String commodityName);
}
