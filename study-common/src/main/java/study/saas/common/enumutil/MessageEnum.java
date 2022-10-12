package study.saas.common.enumutil;


/**
 * @program: kumi-saas
 * @description: 消息模板的枚举类
 * @author: Jerry
 * @create: 2018-03-01
 **/
public class MessageEnum {

    /*
     * 站内消息：
     */
    // 1 注册
    public final static int REGIST_MESSAGE = 1;
    // 2 预约下单
    public final static int RESERVATION_ORDER_MESSAGE = 2;
    // 3 购买下单
    public final static int PAY_ORDER_MESSAGE = 3;
    // 4 申请退款退款成功
    public final static int REFUND_SUCCESS_MESSAGE = 4;
    // 5 评价审核发送失败结果(二期)
    public final static int EVALUATE_CHECK_FAIL_MESSAGE = 5;
    // 6 申诉结果
    public final static int APPEAL_RESULT_MESSAGE = 6;
    // 7 小山芋变动
    public final static int POTATO_CHANGE_MESSAGE = 7;
    // 8 小山芋违规
    public final static int POTATO_VIOLATION_MESSAGE = 8;
    // 9 小山芋兑换(二期)
    public final static int POTATO_EXCHANGE_MESSAGE = 9;
    // 10 体验订单待体验前(24)小时
    public final static int PRE_EXPERIENCE_ORDER_MESSAGE = 10;
    // 11 体验订单预约体验验证结束前(24)小时
    public final static int END_EXPERIENCE_ORDER_MESSAGE = 11;
    // 12 体验订单验证后7天未评论(二期)
    public final static int EXPERIENCE_NO_COMMENT_MESSAGE = 12;
    // 13 购买订单下单后(24)小时未付款
    public final static int NO_PAID_MESSAGE = 13;
    // 14 购买订单付款后告知点击确认签约
    public final static int SIGNED_MESSAGE = 14;
    // 15 购买订单7天未评论(二期)
    public final static int PAYORDER_NO_COMMENT_MESSAGE = 15;
    // 39 提问回复通知
    public final static int REPLY_MESSAGE = 39;
    /*
     *微信提示：体验
     */
    // 16 首次待体验前(24)小时
    public final static int PRE_EXPERIENCE_MESSAGE = 16;
    // 17 预约体验验证结束前(24)小时
    public final static int END_EXPERIENCE_MESSAGE = 17;
    // 18 首次预约订单验证后7天未评论(二期)
    public final static int REVERT_ORDER_NOCOMMIT_MESSAGE = 18;
    // 19 申诉结果推送 购买
    public final static int PAYAPPEL_RESULT_MESSAGE = 19;
    // 20 购买下单后(24)小时未付款
    public final static int UNPAID_MESSAGE = 20;
    // 21 购买订单付款后告知点击确认签约
    public final static int CONFIRM_SIGNED_MESSAGE = 21;
    // 22 首次购买签约确认后7天未评论(二期)
    public final static int SIGNED_NOCOMMENT_MESSAGE = 22;
    // 23 申请退款成功
    public final static int REQUEST_REFUND_SUCCESS_MESSAGE = 23;
    // 24 小山芋违规
    public final static int POTATO_VIOLATION_WX_MESSAGE = 24;
    // 25 小山芋兑换(二期)
    public final static int POTATO_EXCHANGE_WX_MESSAGE = 25;
    // 26 用户首次预约
    public final static int REVERT_MESSAGE = 26;
    // 27 用户首次购买
    public final static int PAID_MESSAGE = 27;
    // 28 用户首次使用小山芋兑换(二期)
    public final static int USE_POTATO_MESSAGE = 28;
    // 28 用户首次使用小山芋兑换(二期)
    public final static int USE_POTATO_EXCHANGE_MESSAGE = 28;
    // 35 教员审核
    public final static int TEACH_APPLY_MESSAGE = 36;

    /*
     *短信提示：
     */
    // 29 首次待体验前(1)小时 -- 告知体验信息，到机构要验证码可评价及获取小山芋
    public final static int PRE_EXPERIENCE_ONEHOUR_MESSAGE = 29;
    // 30 首次付款后(6)天未签约确认，系统将默认签约的前24小时
    public final static int PAID_NOSIGNED_MESSAGE = 30;
    // 31 申诉结果
    public final static int APPEAL_RESULT_SMS_MESSAGE = 31;
    // 32 申请退款成功
    public final static int REQUEST_REFUND_MESSAGE = 32;
    // 33 小山芋违规
    public final static int POTATO_VIOLATION_SMS_MESSAGE = 33;
    // 34 小山芋兑换(二期)
    public final static int POTATO_EXCHANGE_SMS_MESSAGE = 34;


}
