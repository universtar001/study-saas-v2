package study.saas.common.enumutil;

/**
 * @Created Jerry
 * @Description 全局常量配置
 * @Date 2018/4/13
 */
public class OrderEnumEntity {

    /** 订单类型 */
    public static final String ORDER_KUMI = "productPrice";
    public static final String ORDER_SKU = "sku";
    public static final String ORDER_SKU_GROUP = "skuGroup";
    public static final String ORDER_COMMODITY = "commodity";

    /** 订单有关状态 */
    public static final Integer ORDER_TYPE_USED = 1;  //1.正在使用订单
    public static final Integer ORDER_TYPE_PREPARE = 2; //2.预付订单
    public static final Integer ORDER_TYPE_EXPIRED= 3; //3.废弃订单

    /** 试用订单状态 */
    public static final Integer IS_TRIED = 0;

    /** 购买订单状态  */
    public static final Integer NEW_ORDER = 1;//新购买订单
    public static final Integer RENEWALS_ORDER = 2;//续费订单
    public static final Integer UPGRADE_ORDE = 3;//升级订单

    /** 等待成团，即：买家已付款，等待成团 */
    public static final Integer WAIT_GROUP = 13;
    /** 交易完成的订单 */
    public static final Integer FINISH_ORDER = 4;
    /** (付款以后用户退款成功或者付款超时或商家取消，即：交易已关闭) */
    public static final Integer TRADE_CLOSED = 5;
}
