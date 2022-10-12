package study.saas.common.enumutil;

import java.util.HashMap;
import java.util.Map;

public enum UserIdentityEnum {
    ORDINARY(0,"普通用户"),
    DISTRIBUTION(1,"分销员");

    private Integer code;

    private String msg;

    UserIdentityEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


    private static final Map<Integer,UserIdentityEnum> intToTypeMap = new HashMap<>();

    static {

        for (UserIdentityEnum type : UserIdentityEnum.values()){
            intToTypeMap.put(type.getCode(),type);
        }
    }

    public static UserIdentityEnum of(int x){
        return intToTypeMap.get(x);
    }
}
