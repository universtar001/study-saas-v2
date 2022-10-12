package study.saas.common.util;

import org.springframework.stereotype.Component;

import javax.persistence.Table;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * @author even
 * @Title: ColumnUtil
 * @Description: TODO
 * @date 2018/10/15下午4:00
 */
@Component
public class ColumnUtil {

    public static void requestLimit(Class T, String str) throws Exception {
        Annotation subAnnotation = T.getAnnotation(Table.class);
        if (subAnnotation == null) {
            System.out.println("please add Table");
            return;
        }
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(subAnnotation);
        Field value = invocationHandler.getClass().getDeclaredField("memberValues");
        value.setAccessible(true);
        Map<String, Object> memberValues = (Map<String, Object>) value.get(invocationHandler);
        String val = (String) memberValues.get("name");
        System.out.println("saas" + str + val);
        memberValues.put("name", "saas" + str + val);
    }
}
