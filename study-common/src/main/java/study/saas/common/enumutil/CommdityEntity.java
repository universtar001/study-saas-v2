package study.saas.common.enumutil;

/**
 * @author 商品枚举
 * @date 2019-05-22 19:46
 */
public class CommdityEntity {
    //关于库存
    /**
     * 1 修改
     */
    public static final int UPDATE_INVENTORY = 1;
    /**
     * 2 下单减少
     */
    public static final int ADD_INVENTORY = 2;
    /**
     * 3取消订单 增加ss
     */
    public static final int SUBTRACT_INVENTORY = 3;
}
