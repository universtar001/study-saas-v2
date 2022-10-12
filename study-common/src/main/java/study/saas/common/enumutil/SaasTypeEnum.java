package study.saas.common.enumutil;

import java.util.HashMap;
import java.util.Map;

public enum SaasTypeEnum {
    wxp,//小程序 0
    wxb,//订阅公众号后 1
    wxo,//没有订阅也可以获取 2
    app,// 3 app
    web,// 4 web网页
    czy,//彩之云 5
    zfb,//支付宝 6
    wxa;// 7代开小程序

    private static final Map<Integer,SaasTypeEnum> intToTypeMap = new HashMap<>();

    static {

        for (SaasTypeEnum type : SaasTypeEnum.values()){
            intToTypeMap.put(type.ordinal(),type);
        }
    }

    public static SaasTypeEnum of(int x){
        return intToTypeMap.get(x);
    }
}
