package study.saas.common.util;

/**
 * @author Peter on 2017-03-02.
 */
public class Constant {
    public static final String IpAddress = "ipAddress";
    public static final String Authorization = "Authorization";
    public static final String TenantId = "TenantId";

    public static final String ProductPin = "ProductPin";

    public static final String USERID = "userId";
    public static final String ADMINID = "adminId";
    public static final String IDENTITY = "Identity";
    public static final String CALLER_SERVICE = "callerService";
    public static final String IFOPERATOR = "ifOperator";

    /** 当前用户 */
    public static final String CURRENT_USER = "CURRENT_USER";

    public static final String USERTYPE = "userType";

    public static final String OPEN_ID = "openid";

    public static final String WECHAT_WEBAUTH_ACCESSTOKEN = "weChatWebAuthAccessToken";

    public static final String WECHAT_WEBAUTH_ACCESSTOKEN_TIMESTAMP = "weChatWebAuthAccessTokenTimeStamp";

    public static final String WECHAT_WEBAUTH_REFRESHTOKEN = "weChatWebAuthRefreshTokenTimeStamp";

//    public static final String WEB_DOMAIN= "http://www.linjuxue.com/";
//
//    public static final String API_PORT= "9997";

    public static final String ALIPAY_GATE_WAY = "https://openapi.alipay.com/gateway.do"; //沙箱:https://openapi.alipaydev.com/gateway.do 正式:https://openapi.alipay.com/gateway.do

    public static final String ALIPAY_APP_ID = "2018040902525677"; //沙箱: 正式:2017041606755749

    public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjGoUsj2hK1yDx18u0giER5Hl2VYaCTVZGAzvSf0Y7yDzltqsZEaEeanZIN8EIgVJhv4tY9SHocZTI0HYDjWJIT1mxBw1QWgLt3EcMMk7pxjQoxp4r7yqBAcxbHkqOPab3kFJLbmQCM7jCpZHJ+Ak2oLzMmNyw0pMLcv8cf/gVcI6gphunMBNxG8BdNx/1Fd3G83XjUANpIRaOaIwAc/VoGTONCWZ4E7Eqh49sjHrrlz6DSqkpnnyD2lz38BonSv5EK2Iup76QAnMPpPGVw9ObXZue9vjsEmAcCCESKEc9tykc+EnAagzoQP4Dyc7PGu32ogouUgtoYMqFxBPrpdg7QIDAQAB";// 沙箱:AliSandBoxPublicKey 正式:AliPublicKey

    public static final String ALIPAY_CHARSET = "UTF-8";//UTF-8

    public static final String ALIPAY_FORMAT = "json";

    public static final String ALIPAY_SIGN_TYPE = "RSA2";

    public static final String RSA_PRIVATE_KEY = "RsaPrivateKey";

    public static final String ALIPAY_RETURN_URL_Borrower= "http://www.lendingbay.cn/#/BorrowUser/BorrowPayInfo";

    public static final String ALIPAY_RETURN_URL_Credit= "http://www.lendingbay.cn/#/CreditManager/SubmitPriceFee";

    public static final String ALIPAY_NOTIFY_URL= "http://www.lendingbay.cn:8080/alipayCallBack/notify_url.do";

    public static final String WeChat_API_Domain = "sh.api.util.qq.com";//微信上海域名,可用可不用

//    public static final String WeChat_AppID = "wx0af20685ad131322";
//
//    public static final String WeChat_AppSecret = "5e5b174a4d4a88d3e1c049305754ecfd";

    public static final String WeChat_Token = "2078522366573249";//第三方开发才用得到

    public static final String WeChat_EncodingAESKey = "oybwiOMP4L3UMOUPCxSAtlqE53B1k3azx4iiG9rsQh1";//第三方开发才用得到

    public static final String WeChat_WebLicenseUrl = "https://open.util.qq.com/connect/oauth2/authorize";

    public static final String WeChat_WebLicenseUrlByCode = "https://api.util.qq.com/sns/oauth2/access_token";

    public static final String WeChat_RefreshWebLicenseUrlByCode = "https://api.util.qq.com/sns/oauth2/refresh_token";

    public static final String WeChat_SnsApiUserInfoUrl = "https://api.util.qq.com/sns/userinfo";

    public static final String BaiDu_MapGeocoderUrl = "http://api.map.baidu.com/geocoder/v2/";

    public static final String BaiDu_MapCoordinateTransformUrl = "http://api.map.baidu.com/geoconv/v1/";

    public static final String BaiDu_MapAK = "myX6Dn2gYMSaGCrqlCM7skqGSNCAt9Fh";

    public static final String QiNiuBlock = "";

    public static final String Alidayu_Access_Key = "LTAIBD08VkrWhO9S";

    public static final String Alidayu_Access_Key_Secrect = "KygyT9b4Vl0jc9mrIwYZvi46C9gcYN";

    public static final String tempInfo = "";

    public static final Integer LoginUserId = -1;

    public static final String Role = "";

    public static final Integer CustomerId = -1;

    public static final String CACHE_NAMESPACE = "KUMI_SAAS_CACHE";

    /*比较器reference*/
    public static final String ORGANIZATIONS_DISTANCE_COMPARATOR = "kumi.saas.edu.web.boss.comparator.impl.OrganizationsDistanceComparator";
    public static final String ORGANIZATIONS_DEAL_COMPARATOR = "kumi.saas.edu.web.boss.comparator.impl.OrganizationsDealComparator";
    public static final String ORGANIZATIONS_APPOINT_COMPARATOR = "kumi.saas.edu.web.boss.comparator.impl.OrganizationsAppointmentComparator";
}
