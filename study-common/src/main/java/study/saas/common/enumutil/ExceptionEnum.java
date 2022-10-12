package study.saas.common.enumutil;


import java.util.HashMap;
import java.util.Map;

/**
 * Ajax 请求时的自定义查询状态码，主要参考Http状态码，但并不完全对应
 *
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:19:19
 */
public enum ExceptionEnum {
    /**
     * tenant微服务未启动
     */
    DUBBO_TENANT_WXP(92000, "tenant微服务与wxp微服务关联断开,请重启wxp微服务"),

    /**
     * 200请求成功
     */
    OK(200, "请求成功"),
    /**
     * 207频繁操作
     */
    MULTI_STATUS(207, "频繁操作"),
    /**
     * 303登录失败
     */
    LOGIN_FAIL(303, "登录失败"),
    /**
     * 304不知道的账号
     */
    UNKNOWN_ACCOUNT(304, "不知道的账号"),
    /**
     * 305不正确的凭证
     */
    INCORRECT_CREDENTIALS(305, "不正确的凭证"),
    /**
     * 400请求参数出错
     */
    BAD_REQUEST(400, "请求参数出错"),
    /**
     * 401没有登录
     */
    UNAUTHENTICATED(401, "没有登录"),
    /**
     * 402账号密码错误
     */
    UNKNOWNACCOUNT(402, "账号密码错误"),
    /**
     * 403没有权限
     */
    FORBIDDEN(403, "没有权限"),
    /**
     * 404找不到页面
     */
    NOT_FOUND(404, "找不到页面"),
    /**
     * 408请求超时
     */
    REQUEST_TIMEOUT(408, "请求超时"),
    /**
     * 409发生冲突
     */
    CONFLICT(409, "发生冲突"),
    /**
     * 410已被删除
     */
    GONE(410, "已被删除"),
    /**
     * 423已被锁定
     */
    LOCKED(423, "已被锁定"),
    /**
     * 423已被锁定
     */
    NOTENANTID(424, "已被锁定"),
    /**
     * 当前产品已经被删除，请联系管理员
     */
    INTERNAL_PRODUCT(430, "当前产品已经被删除，请联系管理员"),
    /**
     * 当前产品已经过期
     */
    EXPIRED_PRODUCTTIME(444, "当前产品已经过期"),
    /**
     * 500服务器出错
     */
    INTERNAL_SERVER_ERROR(500, "服务器出错"),
    /**
     * 存储发生异常，无法识别传入实体
     */
    INVALID_IDENTITY(30001, "你当前身份没有调取该接口的权限"),
    /**
     * 存储发生异常，无法识别传入实体
     */
    UNKNOWN_ENTITY(39999, "存储发生异常，无法识别传入实体"),
    /**
     * 无效的AuthorizationToken
     */
    INVALID_AUTHORIZATIONTOKEN(40000, "无效的AuthorizationToken"),
    /**
     * 获取access_token时Secret错误，或者access_token无效
     */
    INVALID_ACCESS_TOKEN(40001, "获取access_token时Secret错误，或者access_token无效"),
    /**
     * 不合法的凭证类型
     */
    INVALID_CREDENTIAL(40002, "不合法的凭证类型"),
    /**
     * 不合法的UserID
     */
    INVALID_USERID(40003, "不合法的UserID"),
    /**
     * 不合法的媒体文件类型
     */
    INVALID_MEDIA(40004, "不合法的媒体文件类型"),
    /**
     * 不合法的文件类型
     */
    INVALID_FILETYPE(40005, "不合法的文件类型"),
    /**
     * 不合法的文件大小
     */
    INVALID_FILESIZE(40006, "不合法的文件大小"),
    /**
     * 不合法的媒体文件id
     */
    INVALID_MEDIAID(40007, "不合法的媒体文件id"),
    /**
     * 签名验证错误
     */
    ValidateSignatureError(40008, "签名验证错误"),
    /**
     * xml解析失败
     */
    ParseXmlError(40009, "xml解析失败"),
    /**
     * sha加密生成签名失败
     */
    ComputeSignatureError(40010, "sha加密生成签名失败"),
    /**
     * SymmetricKey非法
     */
    IllegalAesKey(40011, "SymmetricKey非法"),
    /**
     * appid校验失败
     */
    ValidateAppidError(40012, "appid校验失败"),
    /**
     * invalid appid，appid或open_appid无效
     */
    INVALID_APPIDOROPENAPPID(40013, "invalid appid，appid或open_appid无效"),
    /**
     * aes加密失败
     */
    EncryptAESError(40014, "aes加密失败"),
    /**
     * 不合法的菜单类型
     */
    INVALID_MENUTYPE(40015, "不合法的菜单类型"),
    /**
     * aes解密失败
     */
    DecryptAESError(40016, "aes解密失败"),
    /**
     * 解密后得到的buffer非法
     */
    IllegalBuffer(40017, "解密后得到的buffer非法"),
    /**
     * 无效的订单号
     */
    INVALID_ORDERID(40021, "无效的订单号"),
    /**
     * 不合法的子菜单级数
     */
    INVALID_MENULEVEL(40022, "不合法的子菜单级数"),
    /**
     * 不合法的oauth_code
     */
    INVALID_OAUTHCODE(40029, "不合法的oauth_code"),
    /**
     * 不合法的参数
     */
    INVALID_PARAM(40035, "不合法的参数"),
    /**
     * 不合法的请求格式
     */
    INVALID_REQUESTFORMAT(40038, "不合法的请求格式"),
    /**
     * 不合法的上报地理位置标志位
     */
    INVALID_GEOLOCATION(40059, "不合法的上报地理位置标志位"),
    /**
     * 设置应用头像失败
     */
    INVALID_AVATAR(40061, "设置应用头像失败"),
    /**
     * 参数为空
     */
    INVALID_NULLPARAM(40063, "参数为空"),
    /**
     * 标题长度不合法
     */
    INVALID_TITLELENGTH(40067, "标题长度不合法"),
    /**
     * 不合法的openid
     */
    INVALID_OPENID(40073, "不合法的openid"),
    /**
     * 不合法的预授权码
     */
    INVALID_PREAUTHCODE(40077, "不合法的预授权码"),
    /**
     * 不合法的第三方应用appid
     */
    INVALID_APPID(40086, "不合法的第三方应用appid"),
    /**
     * 不合法的URL
     */
    INVALID_URL(40094, "不合法的URL"),
    /**
     * 修改失败
     */
    INVALID_UPDATEFAIL(40095, "修改失败"),
    /**
     * 缺少bannerKeyId
     */
    MISS_BANNERKEYID(40096, "缺少bannerKeyId"),
    /**
     * 缺少tenantId
     */
    MISS_TENANTID(40097, "缺少tenantId"),
    /**
     * 缺少productPin
     */
    MISS_PRODUCTPIN(40098, "缺少productPin"),
    /**
     * 缺少productId
     */
    MISS_PRODUCTID(40099, "缺少productId"),
    /**
     * 缺少projectId
     */
    MISS_PROJECTID(40100, "缺少projectId"),
    /**
     * code无效,已经被使用过
     */
    INVALID_CODEBEENUSED(40163, "code无效,已经被使用过"),
    /**
     * 缺少HttpServletRequest参数
     */
    MISS_HTTPSERVLETREQUEST(41000, "缺少HttpServletRequest参数"),
    /**
     * 缺少access_token参数
     */
    MISS_ACCESSTOKEN(41001, "缺少access_token参数"),
    /**
     * 缺少refresh_token参数
     */
    MISS_REFRESHTOKEN(41003, "缺少refresh_token参数"),
    /**
     * 缺少secret参数
     */
    MISS_SECRET(41004, "缺少secret参数"),
    /**
     * 缺少media_id参数
     */
    MISS_MEDIAID(41006, "缺少media_id参数"),
    /**
     * 缺少用户信息
     */
    MISS_USERINFO(41007, "缺少用户信息"),
    /**
     * 缺少oauth code
     */
    MISS_OAUTHCODE(41008, "缺少oauth code"),
    /**
     * 缺少UserID
     */
    MISS_ADMINID(41009, "缺少adminId"),
    /**
     * 缺少url
     */
    MISS_URL(41010, "缺少url"),
    /**
     * 手机号或者密码错误
     */
    UNKNOWN_ADMINACCOUNT(41011, "手机号或者密码错误"),
    /**
     * 缺少应用名字
     */
    MISS_PRODUCTNAME(41013, "缺少应用名字"),
    /**
     * 缺少应用描述
     */
    MISS_DESC(41014, "缺少应用描述"),
    /**
     * 缺少Content
     */
    MISS_CONTENT(41015, "缺少Content"),
    /**
     * 缺少标题
     */
    MISS_TITLE(41016, "缺少标题"),
    /**
     * 不合法的日期格式
     */
    UNVIABLE_DATE(41017, "不合法的日期格式"),
    /**
     * 缺少OpenId
     */
    MISS_OPENID(41018, "缺少openId"),
    /**
     * access_token过期
     */
    EXPIRED_ACCESSTOKEN(42001, "access_token过期"),
    /**
     * refresh_token过期
     */
    EXPIRED_REFRESHTOKEN(42002, "refresh_token过期"),
    /**
     * oauth_code过期
     */
    EXPIRED_OAUTHCODE(42003, "oauth_code过期"),
    /**
     * 预授权码失效
     */
    EXPIRED_PREOAUTHCODE(42007, "预授权码失效"),
    /**
     * 需要成员已关注
     */
    NEED_USERCONCERN(43004, "需要成员已关注"),
    /**
     * 需要授权
     */
    NEED_AUTHORIZE(43007, "需要授权"),
    /**
     * 需要支付授权
     */
    NEED_PAYAUTHORIZE(43008, "需要支付授权"),
    /**
     * POST的数据包为空
     */
    EMPTY_POST(44002, "POST的数据包为空"),
    /**
     * 多媒体文件大小超过限制
     */
    MEDIAFILESIZE_EXCEED(45001, "多媒体文件大小超过限制"),
    /**
     * 消息内容大小超过限制
     */
    MSGCONTENSIZE_EXCEED(45002, "消息内容大小超过限制"),
    /**
     * 描述大小超过限制
     */
    DESCSIZE_EXCEED(45004, "描述大小超过限制"),
    /**
     * 链接长度超过限制
     */
    URLLENGTH_EXCEED(45005, "链接长度超过限制"),
    /**
     * 接口调用超过限制
     */
    APIREQUEST_LIMIT(45009, "接口调用超过限制"),
    /**
     * banner样式数量超过限制
     */
    BANNERTYPE_LIMIT(45010, "banner样式数量超过限制"),
    /**
     * 帐号数量超过上限
     */
    ACCOUNTNUM_LIMIT(45024, "帐号数量超过上限"),
    /**
     * 职员数量超过上限
     */
    EMPLOYEENUM_LIMIT(45025, "职员数量超过上限"),
    /**
     * 请先绑定小程序
     */
    WXPROXYNOTFOUND(46003, "请先绑定小程序"),
    /**
     * 不存在的成员
     */
    USERNOTFOUND(46004, "不存在的成员"),
    /**
     * 解析JSON/XML内容错误
     */
    PARSEJSONORXML_ERROR(47001, "解析JSON/XML内容错误"),
    /**
     * 应用已停用
     */
    PRODUCT_SOLDOUT(50003, "应用已停用"),
    /**
     * 成员状态不正确，需要成员为企业验证中状态
     */
    USERSTATE_ERROR(50004, "成员状态不正确，需要成员为企业验证中状态"),
    /**
     * 部门长度不符合限制
     */
    DEPTNAMELENGTH_LIMIT(60001, "部门长度不符合限制"),
    /**
     * 部门层级深度超过限制
     */
    DEPTLEVEL_LIMIT(60002, "部门层级深度超过限制"),
    /**
     * 部门不存在
     */
    DEPT_NOTFOUND(60003, "部门不存在"),
    /**
     * 删除部门失败
     */
    DELETEDEPT_FAIL(60128, "删除部门失败"),
    /**
     * 当前机构下有相关商品，无法删除
     */
    COMMODITYEXISTS_DELETEFAIL(60129, "当前机构下有相关商品，无法删除"),
    /**
     * 父亲部门不存在
     */
    PARENTDEPT_NOTFOUND(60004, "父亲部门不存在"),
    /**
     * 不允许删除有成员的部门
     */
    DEPTWITHEMPLOYEE_DELETE_NOTALLOWED(60005, "不允许删除有成员的部门"),
    /**
     * 不允许删除有子部门的部门
     */
    DEPTWITHCHILDDELETE_NOTALLOWED(60006, "不允许删除有子部门的部门"),
    /**
     * 不允许删除根部门
     */
    ROOTDEPTDELETE_NOTALLOWED(60007, "不允许删除根部门"),
    /**
     * 部门ID或者部门名称已存在
     */
    DEPTIDORNAME_EXISTS(60008, "部门ID或者部门名称已存在"),
    /**
     * 手机号码不合法
     */
    INVALID_PHONENUM(60103, "手机号码不合法"),
    /**
     * 手机号码已存在
     */
    PHONENUM_EXISTS(60104, "手机号码已存在"),
    /**
     * 邮箱不合法
     */
    INVALID_EMAIL(60105, "邮箱不合法"),
    /**
     * 邮箱已存在
     */
    EMAIL_EXISTS(60106, "邮箱已存在"),
    /**
     * 微信号不合法
     */
    INVALID_WECHAT(60107, "微信号不合法"),
    /**
     * 微信号已存在
     */
    WECHAT_EXISTS(60108, "微信号已存在"),
    /**
     * 成员姓名不合法
     */
    INVALID_USERNAME(60112, "成员姓名不合法"),
    /**
     * 成员已禁用
     */
    USER_BAN(60120, "成员已禁用"),
    /**
     * 无效的部门id
     */
    DEPTID_NOTFOUND(60123, "无效的部门id"),
    /**
     * 无效的父部门id
     */
    PARENTDEPTID_NOTFOUND(60124, "无效的父部门id"),
    /**
     * 非法部门名字，长度超过限制、重名等，重名包括与csv文件中同级部门重名或者与旧组织架构包含成员的同级部门重名
     */
    DEPTNAME_DUPLICATE(60125, "非法部门名字，长度超过限制、重名等，重名包括与csv文件中同级部门重名或者与旧组织架构包含成员的同级部门重名"),
    /**
     * 创建部门失败
     */
    CREATEDEPT_FAIL(60126, "创建部门失败"),
    /**
     * 缺少部门id
     */
    MISS_DEPTID(60127, "缺少部门id"),
    /**
     * 该小程序或者公众号绑定了多个平台,请去小程序或者公众号的后台取消授权,然后重新绑定即可
     */
    UNAUTHORIZED_ISAPI(61007, "该小程序或者公众号绑定了多个平台,请去小程序或者公众号的后台取消授权,然后重新绑定即可"),
    /**
     * 包含不合法的词语
     */
    CONTAIN_SENSITIVEWORD(85000, "包含不合法的词语"),


    /**
     * 85001	微信号不存在或微信号设置为不可搜索
     */
    NOTEXIST_WECHAT(85001, "微信号不存在或微信号设置为不可搜索"),
    /**
     * 85002	小程序绑定的体验者数量达到上限
     */
    UPPERLIMIT_TRAILWXP(85002, "小程序绑定的体验者数量达到上限"),
    /**
     * 85003	微信号绑定的小程序体验者达到上限
     */
    UPPERLIMIT_TRAILWECHAT(85003, "微信号绑定的小程序体验者达到上限"),
    /**
     * 85004	微信号已经绑定
     */
    WECHAT_ISBOUND(85004, "微信号已经绑定"),

    /**
     * 85006   标签格式错误
     */
    BAD_LABEL_FORMAT(85006, "标签格式错误"),
    /**
     * 85007   页面路径错误
     */
    PAGE_PATH_ERROR(85007, "页面路径错误"),
    /**
     * 85008   类目填写错误
     */
    CATEGORY_ERROR(85008, "类目填写错误"),
    /**
     * 85009   已经有正在审核的版本
     */
    HAVE_REVIEWING_VERSION(85009, "已经有正在审核的版本"),
    /**
     * 85010   item_list有项目为空
     */
    HAVE_EMPTY_ITEMS(85010, "item_list有项目为空"),
    /**
     * 85011   标题填写错误
     */
    TITLE_ERROR(85011, "标题填写错误"),

    /**
     * 85012	无效的审核id
     */
    INVALID_AUDIT_ID(85012, "无效的审核id"),
    /**
     * 85013	无效的自定义配置
     */
    INVALID_CUSTOM_CONFIGURATION(85013, "无效的自定义配置"),
    /**
     * 85014	无效的模版编号
     */
    INVALID_TEMPLATE_NUMBER(85014, "无效的模版编号"),
    /**
     * 85015	该账号不是小程序账号
     */
    NOT_WXP_ACCOUNT(85015, "该账号不是小程序账号"),
    /**
     * 85016	域名数量超过限制
     */
    EXCEEDLIMIT_DOAMIN(85016, "域名数量超过限制"),
    /**
     * 85017	没有新增域名，请确认小程序已经添加了域名或该域名是否没有在第三方平台添加
     */
    NO_NEW_DOMAIN(85017, "没有新增域名，请确认小程序已经添加了域名或该域名是否没有在第三方平台添加"),
    /**
     * 85018	域名没有在第三方平台设置
     */
    NOTSETDOMAIN_ONTHIRD(85018, "域名没有在第三方平台设置"),
    /**
     * 85019	没有审核版本
     */
    NO_AUDIT_VERSION(85019, "没有审核版本"),
    /**
     * 85020	审核状态未满足发布
     */
    AUDIT_STATUS_NOT_FULFILLED(85020, "审核状态未满足发布"),
    /**
     * 85021	状态不可变
     */
    STATUS_CANNOT_CHANGE(85021, "状态不可变"),
    /**
     * 85022	action非法
     */
    ACTION_ILLEGAL(85022, "action非法"),
    /**
     * 85043   模版错误
     */
    TEMPLATE_ERROR(85043, "模版错误"),
    /**
     * 85044   代码包超过大小限制
     */
    CODE_EXCEEDS_LIMIT(85044, "代码包超过大小限制"),
    /**
     * 85045   ext_json有不存在的路径
     */
    EXTJSON_NO_PATH(85045, "ext_json有不存在的路径"),
    /**
     * 85046   tabBar中缺少path
     */
    MISSING_PATH_TABBAR(85046, "tabBar中缺少path"),
    /**
     * 85047   pages字段为空
     */
    PAGES_FIELD_EMPTY(85047, "pages字段为空"),
    /**
     * 85048   ext_json解析失败
     */
    EXTJSON_PARSE_FAILURE(85048, "ext_json解析失败"),
    /**
     * 85052   应用程序已经发布
     */
    APP_IS_ALREADY_RELEASED(85052, "应用程序已经发布"),
    /**
     * 85064   找不到模版
     */
    CANNOT_FIND_TEMPLATE(85064, "找不到模版"),
    /**
     * 85065   模版库已满
     */
    TEMPLATE_LIBRARY_FULL(85065, "模版库已满"),
    /**
     * 85083   搜索标记位被封禁，无法修改
     */
    SEARCH_MARKERS_BLOCKED(85083, "搜索标记位被封禁，无法修改"),
    /**
     * 85084   非法的status值，只能填0或者1
     */
    ILLEGAL_STATUS_VALUE(85084, "非法的status值，只能填0或者1"),


    /**
     * 85066	链接错误
     */
    LINK_ERROR(85066, "链接错误"),
    /**
     * 85068	测试链接不是子链接
     */
    NOT_CHILD_LINK(85068, "测试链接不是子链接"),
    /**
     * 85069	校验文件失败
     */
    FAILED_VERIFY_FILE(85069, "校验文件失败"),
    /**
     * 85070	链接为黑名单
     */
    BLACKLISTED_LINK(85070, "链接为黑名单"),
    /**
     * 85071	已添加该链接，请勿重复添加
     */
    REPEATEDLY_ADDED(85071, "已添加该链接，请勿重复添加"),
    /**
     * 85072	该链接已被占用
     */
    OCCUPIED_LINK(85072, "该链接已被占用"),
    /**
     * 85073	二维码规则已满
     */
    FULL_QR_CODE(85073, "二维码规则已满"),
    /**
     * 85074	小程序未发布, 小程序必须先发布代码才可以发布二维码跳转规则
     */
    WXP_UNPUBLISHED(85074, "小程序未发布, 小程序必须先发布代码才可以发布二维码跳转规则"),
    /**
     * 85075	个人类型小程序无法设置二维码规则
     */
    PERSONAL_WXP(85075, "个人类型小程序无法设置二维码规则"),
    /**
     * 85076	链接没有ICP备案
     */
    LINK_NO_ICP_RECORD(85076, "链接没有ICP备案"),

    /**
     * 86002	小程序未初始化完成
     */
    WXP_UNINITIALIZED(86002, "小程序未初始化完成"),
    /**
     * 85079	小程序没有线上版本，不能进行灰度
     */
    NO_ONLINE_VERSION_WXP(85079, "小程序没有线上版本，不能进行灰度"),
    /**
     * 85080	小程序提交的审核未审核通过
     */
    UNAPPROVED_WXP(85080, "小程序提交的审核未审核通过"),
    /**
     * 85081	无效的发布比例
     */
    INVALID_RELEASE_RATIO(85081, "无效的发布比例"),
    /**
     * 85082	当前的发布比例需要比之前设置的高
     */
    BELOW_PREVIOUSLY_RATIO(85082, "当前的发布比例需要比之前设置的高"),


	/*
	87011	现网已经在灰度发布，不能进行版本回退
	87012	该版本不能回退，可能的原因：1:无上一个线上版用于回退 2:此版本为已回退版本，不能回退 3:此版本为回退功能上线之前的版本，不能回退
	 */
    /**
     * 87011	现网已经在灰度发布，不能进行版本回退
     */
    NOT_ROLL_BACK(87011, "现网已经在灰度发布，不能进行版本回退"),
    /**
     * 87012	该版本不能回退，可能的原因：1:无上一个线上版用于回退 2:此版本为已回退版本，不能回退 3:此版本为回退功能上线之前的版本，不能回退
     */
    NOT_ROLLBACK_REASONS(87012, "该版本不能回退，可能的原因：1:无上一个线上版用于回退 2:此版本为已回退版本，不能回退 3:此版本为回退功能上线之前的版本，不能回退"),
    /**
     * 87013	撤回次数达到上限（每天一次，每个月10次）
     */
    MAXIMUM_WITHDRAW(87013, "撤回次数达到上限（每天一次，每个月10次）"),

    /**
     * 85023   审核列表填写的项目数不在1-5以内
     */
    LIST_NUMBER_FILLED(85023, "审核列表填写的项目数不在1-5以内"),
    /**
     * 85077   小程序类目信息失效（类目中含有官方下架的类目，请重新选择类目）
     */
    INVALID_CATEGORY_INFORMATION(85077, "小程序类目信息失效（类目中含有官方下架的类目，请重新选择类目）"),
    /**
     * 85085   近7天提交审核的小程序数量过多，请耐心等待审核完毕后再次提交
     */
    TOO_MANY_PENDING(85085, "近7天提交审核的小程序数量过多，请耐心等待审核完毕后再次提交"),
    /**
     * 86000   不是由第三方代小程序进行调用
     */
    NOT_THIRDPARTY_USED(86000, "不是由第三方代小程序进行调用"),
    /**
     * 86001   不存在第三方的已经提交的代码
     */
    NOT_EXIST_SUBMITTED_CODE(86001, "不存在第三方的已经提交的代码"),
    /**
     * 86002   小程序还未设置昵称、头像、简介。请先设置完后再重新提交。
     */
    NOT_SET_INFORMATION(86002, "小程序还未设置昵称、头像、简介。请先设置完后再重新提交"),
    /**
     * 89000   该公众号 / 小程序 已经绑定了开放平台帐号
     */
    PLANTFORMACCOUNT_BOUNDED(89000, "该公众号 / 小程序 已经绑定了开放平台帐号"),
    /**
     * 89001   Authorizer与开放平台帐号主体不相同
     */
    NOT_SAME_CONTRACTOR(89001, "Authorizer与开放平台帐号主体不相同"),
    /**
     * 89002   该公众号/小程序未绑定微信开放平台帐号
     */
    PLANTFORMACCOUNT_UNBOUNDED(89002, "该公众号/小程序未绑定微信开放平台帐号"),
    /**
     * 89003   该开放平台帐号并非通过api创建，不允许操作
     */
    NOT_CREATE_BY_API(89003, "该开放平台帐号并非通过api创建，不允许操作"),
    /**
     * 89004   该开放平台帐号所绑定的公众号/小程序已达上限(100个)
     */
    MAX_NUMBER_REACHED(89004, "该开放平台帐号所绑定的公众号/小程序已达上限(100个)"),


    /**
     * 89019	业务域名无更改，无需重复设置
     */
    REPEAT_SERVER_DOMAIN(89019, "业务域名无更改，无需重复设置"),
    /**
     * 89020	尚未设置小程序业务域名，请先在第三方平台中设置小程序业务域名后在调用本接口
     */
    NO_APPLET_SERVER_DOMAIN(89020, "尚未设置小程序业务域名，请先在第三方平台中设置小程序业务域名后在调用本接口"),
    /**
     * 89021	请求保存的域名不是第三方平台中已设置的小程序业务域名或子域名
     */
    NOT_BELONG_SERVER_DOMAIN(89021, "请求保存的域名不是第三方平台中已设置的小程序业务域名或子域名"),
    /**
     * 89029	业务域名数量超过限制
     */
    EXCEEDLIMIT_SERVER_DOAMIN(89029, "业务域名数量超过限制"),
    /**
     * 89231	个人小程序不支持调用setwebviewdomain 接口
     */
    NOT_SUPPORT_SETWEBVIEWDOMAIN(89231, "个人小程序不支持调用setwebviewdomain 接口"),


    /**
     * 找不到商品
     */
    NOT_FOUND_SKU(89501, "找不到商品"),

    /**
     * 卡券已被核销
     */
    COUPON_USED(91004, "卡券已被核销 "),
    /**
     * 无效的code
     */
    INVALID_CODE(91011, "无效的code"),
    /**
     * 缺少卡券详情
     */
    MISS_COUPONDESC(91014, "缺少卡券详情"),
    /**
     * 代金券缺少least_cost或者reduce_cost参数
     */
    VOUCHER_MISS_LEASTCOSTORREDUCECOST(91014, "代金券缺少least_cost或者reduce_cost参数"),
    /**
     * 折扣券缺少discount参数
     */
    MISS_COUPONDISCOUNT(91016, "折扣券缺少discount参数"),
    /**
     * 礼品券缺少gift参数
     */
    MISS_COUPONGIFT(91017, "礼品券缺少gift参数"),
    /**
     * 缺少卡券sku参数
     */
    MISS_COUPONSKU(91019, "缺少卡券sku参数"),
    /**
     * 缺少卡券有效期
     */
    MISS_COUPONVALIDATEPERIOD(91020, "缺少卡券有效期"),
    /**
     * 缺少卡券有效期类型
     */
    MISS_COUPONVALIDATEPERIODTYPE(91021, "缺少卡券有效期类型"),
    /**
     * 缺少卡券logo_url
     */
    MISS_COUPONLOGOURL(91022, "缺少卡券logo_url"),
    /**
     * 缺少卡券code类型
     */
    MISS_COUPONCODETYPE(91023, "缺少卡券code类型"),
    /**
     * 缺少卡券title
     */
    MISS_COUPONTITLE(91025, "缺少卡券title"),
    /**
     * 缺少卡券color
     */
    MISS_COUPONCOLOR(91026, "缺少卡券color"),
    /**
     * 缺少card_id
     */
    MISS_CARDID(91029, "缺少card_id "),
    /**
     * 缺少卡券code
     */
    MISS_COUPONCODE(91030, "缺少卡券code"),
    /**
     * 缺少卡券notice
     */
    MISS_NOTICE(91031, "缺少卡券notice"),
    /**
     * 不合法的卡券id
     */
    MISS_COUPONID(91039, "不合法的卡券id"),
    /**
     91040	不合法的ticket type
     91041	没有创建，上传卡券logo，以及核销卡券的权限
     91042	没有该卡券投放权限
     91043	没有修改或者删除该卡券的权限
     91044	不合法的卡券参数
     91045	缺少团购券groupon结构
     91046	缺少现金券cash结构
     91047	缺少折扣券discount 结构
     91048	缺少礼品券gift结构
     91049	缺少优惠券coupon结构
     91050	缺少卡券必填字段
     91051	商户名称超过12个汉字
     91052	卡券标题超过9个汉字
     91053	卡券提醒超过16个汉字
     91054	卡券描述超过1024个汉字
     91055	卡券副标题长度超过18个汉字
     91058	未开通卡券服务，不允许调用卡券接口
     */

    /**
     * 当前没有请求资源，请稍后重试
     */
    MISS_REQUESTSOURCE(91059, "当前没有请求资源，请稍后重试"),
    /**
     * 小程序帐号上传错误
     */
    ERROR_UPLOADCODE(91060, "小程序帐号上传错误"),
    /**
     * 超管已被删除
     */
    MISS_SUPER_ADMIN(91061, "超管已被删除"),

    /**
     * 退款/提现出现异常,请重新尝试
     */
    UNUSUAL_DRAWCASHANDREFUND(92001, "退款/提现出现异常,请重新尝试"),
    /**
     * 当前时间无法退款，请稍后尝试
     */
    UNKNOWN_UNUSUAL_DRAWCASHANDREFUND(92002, "当前时间无法退款/提现，请稍后尝试"),
    /**
     * 退款失败的总code,内容根据实时更新:请自定义内容
     */
    UNKNOWN_UNUSUAL_DEFINED_DRAWCASHANDREFUND(92003, "请自定义"),
    /**
     * 无法根据productPin查询到的均为未绑定的小程序
     */
    UNKNOWN_UNUSUAL_DEFINED_WXP(92004, "小程序未绑定，查询无数据"),

    ORDER_COMMODITY_TYPE(70001, "商品类型错误！"),
    ORDER_PACKAGE_OVERRUN(70002, "包裹修改此处超出限制！"),
    ORDER_IS_NULL(70003, "该订单不存在"),
    ORDER_NO_CANCEL(70004, "该订单已付款,无法取消!"),
    ORDER_FREIGHT_ERROR(70005, "运费已经修改，重新下单！"),
    ORDER_PAY_TOTAL_ERROR(70006, "实付金额有误！"),
    PACKAGE_IS_NULL(70007, "该包裹不存在"),
    PAYMENT_WAY_OUT(700099,"暂不支持此支付方式！");





    private Integer code;

    private String msg;

    ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private static final Map<Integer, String> intToTypeMap = new HashMap<>();

    static {

        for (ExceptionEnum exEnum : ExceptionEnum.values()) {
            intToTypeMap.put(exEnum.getCode(), exEnum.getMsg());
        }
    }

    public static String of(int x) {
        return intToTypeMap.get(x);
    }
}
