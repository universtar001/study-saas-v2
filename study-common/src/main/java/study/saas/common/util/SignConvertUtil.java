package study.saas.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author even
 * @Title: SignConvertUtil
 * @Description: 数云鉴权工具类
 * @date 2019/3/1210:23 AM
 */
public class SignConvertUtil {

    /**
     * =========================================scrm鉴权=================================================
     */

    /**
     * @param callerService 调用方使用的服务名（由调用方自己填写）
     * @param contextPath   被调用方的服务名称
     * @param requestPath   是调用服务剩余的路径
     * @param serviceSecret 调用方申请的密钥（由调用方使用的服务名向被调用方申请密钥）
     * @param timestamp     时间    yyyy-MM-dd HH:mm:ss
     * @param version       被调用方的服务版本号
     */
    public static String generateSign(String callerService, String contextPath, String version, String timestamp, String serviceSecret, String requestPath) {
        String sign = "";
        if (callerService == null || "".equals(callerService) || contextPath == null || "".equals(contextPath)
                || timestamp == null || "".equals(timestamp) || serviceSecret == null || "".equals(serviceSecret)) {
            return sign;
        }
        Map<String, String> map = new LinkedHashMap<>();
        map.put("callerService", callerService);
        map.put("contextPath", contextPath);
        try {
            if (requestPath != null) {
                StringBuilder sb = new StringBuilder();
                for (String part : requestPath.split("/")) {
                    sb.append("/").append(URLEncoder.encode(part, "utf-8"));
                }
                map.put("requestPath", sb.toString().substring(1));
            }
            map.put("timestamp", timestamp);
            map.put("v", version);
            sign = generateMD5Sign(serviceSecret, map);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
        return sign;
    }

    private static String generateMD5Sign(String secret, Map<String, String> parameters) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] bytes = md5.digest(generateConcatSign(secret, parameters).getBytes("utf-8"));
        return byteToHex(bytes);
    }

    private static String generateConcatSign(String secret, Map<String, String> parameters) {
        StringBuilder sb = new StringBuilder().append(secret);
        Set<String> keys = parameters.keySet();
        for (String key : keys) {
            sb.append(key).append(parameters.get(key));
        }
        return sb.append(secret).toString();
    }

    private static String byteToHex(byte[] bytesIn) {
        StringBuilder sb = new StringBuilder();
        for (byte byteIn : bytesIn) {
            String bt = Integer.toHexString(byteIn & 0xff);
            if (bt.length() == 1) {
                sb.append(0).append(bt);
            } else {
                sb.append(bt);
            }
        }
        return sb.toString().toUpperCase();
    }

    /**
     * =========================================粒上皇加密================================================
     */

    /**
     * 密码加密
     *
     * @param passWord  密码
     * @param appSecret 接口调用者的身份密钥
     * @return
     */
    public static String passWordEncryption(String passWord, String appSecret) {
        try {
            String str = passWord + "&" + appSecret;
            String urlEncode = URLEncoder.encode(str.toLowerCase(), "utf-8").toLowerCase();
            String strMd5 = org.apache.commons.codec.digest.DigestUtils.md5Hex(urlEncode);
            return strMd5.toLowerCase();
        } catch (UnsupportedEncodingException exception) {
            return "";
        }
    }

}

