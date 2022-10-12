package study.saas.common.enumutil;

import java.util.HashMap;
import java.util.Map;

public enum PointChangeCauseEnum {
    signInIncrease(1, "签到获取"),
    shareIncrease(2, "分享获取"),
    lotteryIncrease(3, "抽奖获取"),
    giftDecrease(4, "赠送消耗"),
    giftIncrease(5, "赠送获取"),
    exchangeDecrease(6, "兑奖消耗"),
    expiredDecrease(7, "过期消耗"),
    expiredIncrease(8, "转换获取"),
    syntheticIncrease(9, "合成获取"),
    syntheticDecrease(10, "合成消耗"),
    payAmountIncrease(11, "付款获取"),
    emptyDecrease(12, "定期清空"),
    invalidDecrease(13, "已失效");//叫什么好？

    private String name;
    private Integer index;

    private PointChangeCauseEnum(Integer index, String name) {
        this.name = name;
        this.index = index;
    }

    public static String getName(Integer index) {
        for (PointChangeCauseEnum pointChangeCauseEnum : PointChangeCauseEnum.values()) {
            if (pointChangeCauseEnum.getIndex().equals(index)) {
                return pointChangeCauseEnum.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    private static final Map<Integer, PointChangeCauseEnum> intToTypeMap = new HashMap<>();

    static {

        for (PointChangeCauseEnum type : PointChangeCauseEnum.values()) {
            intToTypeMap.put(type.ordinal(), type);
        }
    }

    //自定义的index从1开始，默认的从0开始，用x - 1对应起来
    public static PointChangeCauseEnum of(int x) {
        return intToTypeMap.get(x - 1);
    }
}
