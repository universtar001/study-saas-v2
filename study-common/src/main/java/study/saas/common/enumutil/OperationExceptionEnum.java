package study.saas.common.enumutil;


import java.util.HashMap;
import java.util.Map;

/**
 * Ajax 请求时的自定义查询状态码，主要参考Http状态码，但并不完全对应
 *
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:19:19
 */
public enum OperationExceptionEnum implements BaseExceptionEnum{
    /**
     * 业务代码规范
     * 01 订单order
     * 02 支付payment
     * 03 包裹package
     */
    //01订单
    ORDER_COMMODITY_TYPE("01001", "商品类型错误！"),
    ORDER_PACKAGE_OVERRUN("01002", "包裹修改此处超出限制！"),
    ORDER_IS_NULL("01003", "该订单不存在"),
    ORDER_NO_CANCEL("01004", "该订单已付款,无法取消!"),
    ORDER_FREIGHT_ERROR("01005", "运费已经修改，重新下单！"),
    ORDER_PAY_TOTAL_ERROR("01006", "实付金额有误！"),
    ORDER_GOODS_ADDRESS("01007", "物流地址不存在！"),
    ORDER_PAY_STATE_CLOSE("01008", "该订单已关闭，请刷新重试！"),
    ORDER_START_ERROR("01009", "订单状态错误，请刷新重试！"),
    //02 支付
    PAYMENT_WAY_OUT("02001", "暂不支持此支付方式！"),
    PAYMENT_TRADE_NO_MISSED("02002", "传入订单号错误！"),
    //03包裹
    PACKAGE_IS_NULL("03001", "该包裹不存在"),
    INVALID_PARAM("03002", "不合法的参数"),
    //04优惠券
    COUPON_STATE_ERROR("04001", "优惠价状态异常，请刷新重试！"),
    COUPON_EMPLOY_ERROR("04002", "含有该优惠券不可使用的商品！"),
    COUPON_EMPLOY_MONEY_ERROR("04003", "未达到优惠券使用金额！"),
    COUPON_EMPLOY_TIME_END("04004", "该优惠卷已经过期，请刷新重试！"),
    COUPON_NO_OWN("04005", "未持有该优惠券,请刷新重试！"),
    COUPON_NO_GROUP("04006", "拼团活动暂不支持使用优惠卷"),
    //05 拼团
    GROUP_UPDATE_END_TIME("05001", "修改活动结束时间时只能延长"),
    GROUP_CREATE_END_TIME("05002", "创建生效时间不能低于当前时间"),
    GROUP_END_TIME_ERROR("05003", "该团不能拼团成功，请修改结束时间或拼团有效期"),
    GROUP_PRICE_ERROR("05004", "团金额不得超过原价"),
    GROUP_COMMODITY_OVERRUN("05006", "该商品已经在拼团活动中"),
    GROUP_SATE_NO_END("05007", "只能删除 已结束或已失效的活动"),
    GROUP_END("05008", "该团活动已经结束"),
    GROUP_PARAM_ERROR("05009", "不合法的参数"),
    GROUP_JOIN_ERROR("05010", "该团成员已满，订单已关闭！"),
    GROUP_ACTIVITY_IS_NULL("05011", "该拼团活动不存在"),
    GROUP_ORDER_PAY("05012", "拼团订单只能线上支付"),
    GROUP_USER_END("05013", "该团已结束或成员已满，请取消订单"),
    GROUP_PARTICIPATE("05014", "您已经参与该团，不能重复参与,请取消订单"),
    //06 用户
    USER_IS_NULL("06001", "该用户不存在"),
    //07消息推送
    MESSAGE_PARAM_CONFLICT("07001", "参数冲突！"),
    MESSAGE_DATA_REPEAT("07002", "数据重复！"),
    MESSAGE_CODE_USED("07003","使用中无法删除"),
    MESSAGE_FIELD_MISSED("07004","缺少相关字段"),
    MESSAGE_DATA_LOSS("07005","数据缺失"),
    //08商品
    COMMODITY_INVENTORY_LACK("08001","订单中含有库存不足的商品"),
    RECEIPT_HAVE_PRINTER("08002","存在租户正在使用该样式,不可删除"),
    // 09微信提审
    MISS_REQUESTSOURCE("09001", "当前没有请求资源，请稍后重试"),
    //10 限时促销promotion
    PROMOTION_IS_NULL("10001", "该活动不存在"),
    PROMOTION_END("10001", "促销活动已经结束请刷新重试"),


    //通用异常码
    COMMON_DATA_ERROR("00001", "返回数据异常！"),
    COMMON_PARAM_EMPTY("00002", "传入参数为空"),
    COMMON_PARAM_PAGE_EMPTY("00003", "分页数据不能为空");

    private String code;

    private String msg;

    OperationExceptionEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    private static final Map<String, String> intToTypeMap = new HashMap<>();

    static {

        for (OperationExceptionEnum exEnum : OperationExceptionEnum.values()) {
            intToTypeMap.put(exEnum.getCode(), exEnum.getMsg());
        }
    }

    public static String of(String x) {
        return intToTypeMap.get(x);
    }
}
