package study.saas.common.enumutil;

import java.util.HashMap;
import java.util.Map;

public enum PointActionEnum {
    login(1,"登录"),
    activitySignUp(2,"报名"),
    activitySignIn(3,"签到"),
    afterPay(4,"支付后获取");

    private String name;
    private Integer index;

    private PointActionEnum(Integer index,String name){
        this.index = index;
        this.name = name;
    }

    public static String getName(Integer index){
        for(PointActionEnum pointActionEnum : PointActionEnum.values()){
            if(pointActionEnum.getIndex().equals(index)){
                return pointActionEnum.name;
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

    private static final Map<Integer,PointActionEnum> intToTypeMap = new HashMap<>();

    static {

        for (PointActionEnum type : PointActionEnum.values()){
            intToTypeMap.put(type.ordinal(),type);
        }
    }

    public static PointActionEnum of(int x){
        return intToTypeMap.get(x);
    }
}
