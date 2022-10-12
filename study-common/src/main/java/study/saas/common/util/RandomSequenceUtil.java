package study.saas.common.util;

import java.util.Random;

/**
 * @author Panner
 * @description: 随机序列工具类(数字、大小写字母)
 * @date 2019/1/17 - 9:39
 */
public class RandomSequenceUtil {

    /**
     * 入参代表生成位数
     * @param length
     * @return
     */
    public static String getStringRandom(int length) {

        String val = "";
        Random random = new Random();

        //参数length，表示生成几位随机数
        for (int i = 0; i < length; i++) {
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            //输出字母还是数字
            if ("char".equalsIgnoreCase(charOrNum)) {
                //输出是大写字母还是小写字母,结合ASCII表
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char) (random.nextInt(26) + temp);
            } else {
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }
}
