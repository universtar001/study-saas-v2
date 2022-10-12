package study.saas.common.exceptions;


/**
 * Ajax 请求时的自定义查询状态码，主要参考Http状态码，但并不完全对应
 * 
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:19:19
 */
public enum HttpCode {
	/** 200请求成功 */
	OK(200),
	/** 207频繁操作 */
	MULTI_STATUS(207),
	/** 303登录失败 */
	LOGIN_FAIL(303),
	/** 400请求参数出错 */
	BAD_REQUEST(400),
	/** 401没有登录 */
	UNAUTHENTICATED(401),
	/** 403没有权限 */
	FORBIDDEN(403),
	/** 404找不到页面 */
	NOT_FOUND(404),
	/** 408请求超时 */
	REQUEST_TIMEOUT(408),
	/** 409发生冲突 */
	CONFLICT(409),
	/** 410已被删除 */
	GONE(410),
	/** 423已被锁定 */
	LOCKED(423),
	/** 423已被锁定 */
	NOTENANTID(424),
	/** 当前产品已经过期 */
	EXPIRED_PRODUCTTIME(444),
	/** 500服务器出错 */
	INTERNAL_SERVER_ERROR(500),
	/** 获取access_token时Secret错误，或者access_token无效 */
	INVALID_ACCESS_TOKEN(40001),
	/** 不合法的凭证类型 */
	INVALID_CREDENTIAL(40002),
	/** 不合法的UserID */
	INVALID_USERID(40003),
	/** 不合法的媒体文件类型 */
	INVALID_MEDIA(40004),
	/** 不合法的文件类型 */
	INVALID_FILETYPE(40005),
	/** 不合法的文件大小 */
	INVALID_FILESIZE(40006),
	/** 不合法的媒体文件id */
	INVALID_MEDIAID(40007),
	/**invalid appid，appid或open_appid无效*/
	INVALID_APPIDOROPENAPPID(40013),
	/** 不合法的菜单类型 */
	INVALID_MENUTYPE(40015),
	/** 不合法的子菜单级数 */
	INVALID_MENULEVEL(40022),
	/** 不合法的oauth_code */
	INVALID_OAUTHCODE(40029),
	/** 不合法的参数 */
	INVALID_PARAM(40035),
	/** 不合法的请求格式 */
	INVALID_REQUESTFORMAT(40038),
	/** 不合法的上报地理位置标志位 */
	INVALID_GEOLOCATION(40059),
	/** 设置应用头像失败 */
	INVALID_AVATAR(40061),
	/** 参数为空 */
	INVALID_NULLPARAM(40063),
	/** 标题长度不合法 */
	INVALID_TITLELENGTH(40067),
	/** 不合法的openid */
	INVALID_OPENID(40073),
	/** 不合法的预授权码 */
	INVALID_PREAUTHCODE(40077),
	/** 不合法的第三方应用appid */
	INVALID_APPID(40086),
	/** 不合法的URL */
	INVALID_URL(40094),
	/** 修改失败 */
	INVALID_UPDATEFAIL(40095),
	/** 缺少bannerKeyId */
	MISS_BANNERKEYID(40096),
	/** 缺少tenantId */
	MISS_TENANTID(40097),
	/** 缺少productPin */
	MISS_PRODUCTPIN(40098),
	/** 缺少productId */
	MISS_PRODUCTID(40099),
	/** 缺少HttpServletRequest参数 */
	MISS_HTTPSERVLETREQUEST(41000),
	/** 缺少access_token参数 */
	MISS_ACCESSTOKEN(41001),
	/** 缺少refresh_token参数 */
	MISS_REFRESHTOKEN(41003),
	/** 缺少secret参数 */
	MISS_SECRET(41004),
	/** 缺少media_id参数 */
	MISS_MEDIAID(41006),
	/** 缺少用户信息 */
	MISS_USERINFO(41007),
	/** 缺少oauth code */
	MISS_OAUTHCODE(41008),
	/** 缺少UserID */
	MISS_USERID(41009),
	/** 缺少url */
	MISS_URL(41010),
	/** 缺少应用名字 */
	MISS_PRODUCTNAME(41013),
	/** 缺少应用描述 */
	MISS_DESC(41014),
	/** 缺少Content */
	MISS_CONTENT(41015),
	/** 缺少标题 */
	MISS_TITLE(41016),
	/** access_token过期 */
	EXPIRED_ACCESSTOKEN(42001),
	/** refresh_token过期 */
	EXPIRED_REFRESHTOKEN(42002),
	/** oauth_code过期 */
	EXPIRED_OAUTHCODE(42003),
	/** 预授权码失效 */
	EXPIRED_PREOAUTHCODE(42007),
	/** 需要成员已关注 */
	NEED_USERCONCERN(43004),
	/** 需要授权 */
	NEED_AUTHORIZE(43007),
	/** 需要支付授权 */
	NEED_PAYAUTHORIZE(43008),
	/** POST的数据包为空 */
	EMPTY_POST(44002),
	/** 多媒体文件大小超过限制 */
	MEDIAFILESIZE_EXCEED(45001),
	/** 消息内容大小超过限制 */
	MSGCONTENSIZE_EXCEED(45002),
	/** 描述大小超过限制 */
	DESCSIZE_EXCEED(45004),
	/** 链接长度超过限制 */
	URLLENGTH_EXCEED(45005),
	/** 接口调用超过限制 */
	APIREQUEST_LIMIT(45009),
	/** banner样式数量超过限制 */
	BANNERTYPE_LIMIT(45010),
	/** 帐号数量超过上限 */
	ACCOUNTNUM_LIMIT(45024),
	/**职员数量超过上限*/
	EMPLOYEENUM_LIMIT(45025),
	/** 请先绑定小程序 */
	WXPROXYNOTFOUND(46003),
	/** 不存在的成员 */
	USERNOTFOUND(46004),
	/** 解析JSON/XML内容错误 */
	PARSEJSONORXML_ERROR(47001),
	/** 应用已停用 */
	PRODUCT_SOLDOUT(50003),
	/** 成员状态不正确，需要成员为企业验证中状态 */
	USERSTATE_ERROR(50004),
	/** 部门长度不符合限制 */
	DEPTNAMELENGTH_LIMIT(60001),
	/** 部门层级深度超过限制 */
	DEPTLEVEL_LIMIT(60002),
	/** 部门不存在 */
	DEPT_NOTFOUND(60003),
	/** 父亲部门不存在 */
	PARENTDEPT_NOTFOUND(60004),
	/** 不允许删除有成员的部门 */
	DEPTWITHEMPLOYEE_DELETE_NOTALLOWED(60005),
	/** 不允许删除有子部门的部门 */
	DEPTWITHCHILDDELETE_NOTALLOWED(60006),
	/** 不允许删除根部门 */
	ROOTDEPTDELETE_NOTALLOWED(60007),
	/** 部门ID或者部门名称已存在 */
	DEPTIDORNAME_EXISTS(60008),
	/** 手机号码不合法 */
	INVALID_PHONENUM(60103),
	/** 手机号码已存在 */
	PHONENUM_EXISTS(60104),
	/** 邮箱不合法 */
	INVALID_EMAIL(60105),
	/** 邮箱已存在 */
	EMAIL_EXISTS(60106),
	/** 微信号不合法 */
	INVALID_WECHAT(60107),
	/** 微信号已存在 */
	WECHAT_EXISTS(60108),
	/** 成员姓名不合法 */
	INVALID_USERNAME(60112),
	/** 成员已禁用 */
	USER_BAN(60120),
	/** 无效的部门id */
	DEPTID_NOTFOUND(60123),
	/** 无效的父部门id */
	PARENTDEPTID_NOTFOUND(60124),
	/** 非法部门名字，长度超过限制、重名等，重名包括与csv文件中同级部门重名或者与旧组织架构包含成员的同级部门重名 */
	DEPTNAME_DUPLICATE(60125),
	/** 创建部门失败 */
	CREATEDEPT_FAIL(60126),
	/** 缺少部门id */
	MISS_DEPTID(60127),
	/** 包含不合法的词语 */
	CONTAIN_SENSITIVEWORD(85000),


	/** 85001	微信号不存在或微信号设置为不可搜索 */
	NOTEXIST_WECHAT(85001),
	/** 85002	小程序绑定的体验者数量达到上限 */
	UPPERLIMIT_TRAILWXP(85002),
	/** 85003	微信号绑定的小程序体验者达到上限 */
	UPPERLIMIT_TRAILWECHAT(85003),
	/** 85004	微信号已经绑定 */
	WECHAT_ISBOUND(85004),

	/** 85006   标签格式错误*/
	BAD_LABEL_FORMAT(85006),
	/** 85007   页面路径错误*/
	PAGE_PATH_ERROR(85007),
	/** 85008   类目填写错误*/
	CATEGORY_ERROR(85008),
	/** 85009   已经有正在审核的版本*/
	HAVE_REVIEWING_VERSION(85009),
	/** 85010   item_list有项目为空*/
	HAVE_EMPTY_ITEMS(85010),
	/** 85011   标题填写错误*/
	TITLE_ERROR(85011),

    /** 85012	无效的审核id*/
    INVALID_AUDIT_ID(85012),
    /** 85013	无效的自定义配置*/
    INVALID_CUSTOM_CONFIGURATION(85013),
    /** 85014	无效的模版编号*/
    INVALID_TEMPLATE_NUMBER(85014),
	/** 85015	该账号不是小程序账号 */
	NOT_WXP_ACCOUNT(85015),
	/** 85016	域名数量超过限制 */
	EXCEEDLIMIT_DOAMIN(85016),
	/** 85017	没有新增域名，请确认小程序已经添加了域名或该域名是否没有在第三方平台添加 */
	NO_NEW_DOMAIN(85017),
	/** 85018	域名没有在第三方平台设置  */
	NOTSETDOMAIN_ONTHIRD(85018),
    /** 85019	没有审核版本 */
    NO_AUDIT_VERSION(85019),
    /** 85020	审核状态未满足发布 */
    AUDIT_STATUS_NOT_FULFILLED(85020),
	/** 85021	状态不可变 */
	STATUS_CANNOT_CHANGE(85021),
	/** 85022	action非法 */
	ACTION_ILLEGAL(85022),
    /** 85043   模版错误 */
    TEMPLATE_ERROR(85043),
    /** 85044   代码包超过大小限制 */
    CODE_EXCEEDS_LIMIT(85044),
    /** 85045   ext_json有不存在的路径 */
    EXTJSON_NO_PATH(85045),
    /** 85046   tabBar中缺少path */
    MISSING_PATH_TABBAR(85046),
    /** 85047   pages字段为空 */
    PAGES_FIELD_EMPTY(85047),
    /** 85048   ext_json解析失败 */
    EXTJSON_PARSE_FAILURE(85048),
	/** 85064   找不到模版 */
	CANNOT_FIND_TEMPLATE(85064),
	/** 85065   模版库已满 */
	TEMPLATE_LIBRARY_FULL(85065),
	/** 85083   搜索标记位被封禁，无法修改 */
	SEARCH_MARKERS_BLOCKED(85083),
	/** 85084   非法的status值，只能填0或者1 */
	ILLEGAL_STATUS_VALUE(85084),



	/** 85066	链接错误 */
	LINK_ERROR(85066),
	/** 85068	测试链接不是子链接 */
	NOT_CHILD_LINK(85068),
	/** 85069	校验文件失败 */
	FAILED_VERIFY_FILE(85069),
	/** 85070	链接为黑名单 */
	BLACKLISTED_LINK(85070),
	/** 85071	已添加该链接，请勿重复添加 */
	REPEATEDLY_ADDED(85071),
	/** 85072	该链接已被占用 */
	OCCUPIED_LINK(85072),
	/** 85073	二维码规则已满 */
	FULL_QR_CODE(85073),
	/** 85074	小程序未发布, 小程序必须先发布代码才可以发布二维码跳转规则 */
	WXP_UNPUBLISHED(85074),
	/** 85075	个人类型小程序无法设置二维码规则 */
	PERSONAL_WXP(85075),
	/** 85076	链接没有ICP备案 */
	LINK_NO_ICP_RECORD(85076),

	/** 86002	小程序未初始化完成  */
	WXP_UNINITIALIZED(86002),
	/** 85079	小程序没有线上版本，不能进行灰度 */
	NO_ONLINE_VERSION_WXP(85079),
	/** 85080	小程序提交的审核未审核通过 */
	UNAPPROVED_WXP(85080),
	/** 85081	无效的发布比例 */
	INVALID_RELEASE_RATIO(85081),
	/** 85082	当前的发布比例需要比之前设置的高 */
	BELOW_PREVIOUSLY_RATIO(85082),


	/*
	87011	现网已经在灰度发布，不能进行版本回退
	87012	该版本不能回退，可能的原因：1:无上一个线上版用于回退 2:此版本为已回退版本，不能回退 3:此版本为回退功能上线之前的版本，不能回退
	 */
	/** 87011	现网已经在灰度发布，不能进行版本回退 */
	NOT_ROLL_BACK(87011),
	/**
	 * 87012	该版本不能回退，可能的原因：1:无上一个线上版用于回退 2:此版本为已回退版本，不能回退 3:此版本为回退功能上线之前的版本，不能回退
	 */
	NOT_ROLLBACK_REASONS(87012),
	/** 87013	撤回次数达到上限（每天一次，每个月10次） */
	MAXIMUM_WITHDRAW(87013),

	/** 85023   审核列表填写的项目数不在1-5以内*/
	LIST_NUMBER_FILLED(85023),
	/** 85077   小程序类目信息失效（类目中含有官方下架的类目，请重新选择类目）*/
	INVALID_CATEGORY_INFORMATION(85077),
	/** 85085   近7天提交审核的小程序数量过多，请耐心等待审核完毕后再次提交*/
	TOO_MANY_PENDING(85085),
	/** 86000   不是由第三方代小程序进行调用*/
	NOT_THIRDPARTY_USED(86000),
	/** 86001   不存在第三方的已经提交的代码*/
	NOT_EXIST_SUBMITTED_CODE(86001),
	/** 86002   小程序还未设置昵称、头像、简介。请先设置完后再重新提交。*/
	NOT_SET_INFORMATION(86002),
	/** 89000   该公众号 / 小程序 已经绑定了开放平台帐号*/
	PLANTFORMACCOUNT_BOUNDED(89000),
	/** 89001   Authorizer与开放平台帐号主体不相同*/
	NOT_SAME_CONTRACTOR(89001),
	/** 89002   该公众号/小程序未绑定微信开放平台帐号*/
	PLANTFORMACCOUNT_UNBOUNDED(89002),
	/** 89003   该开放平台帐号并非通过api创建，不允许操作*/
	NOT_CREATE_BY_API(89003),
	/** 89004   该开放平台帐号所绑定的公众号/小程序已达上限(100个)*/
	MAX_NUMBER_REACHED(89004),


	/** 89019	业务域名无更改，无需重复设置 */
	REPEAT_SERVER_DOMAIN(89019),
	/** 89020	尚未设置小程序业务域名，请先在第三方平台中设置小程序业务域名后在调用本接口 */
	NO_APPLET_SERVER_DOMAIN(89020),
	/** 89021	请求保存的域名不是第三方平台中已设置的小程序业务域名或子域名 */
	NOT_BELONG_SERVER_DOMAIN(89021),
	/** 89029	业务域名数量超过限制 */
	EXCEEDLIMIT_SERVER_DOAMIN(89029),
	/** 89231	个人小程序不支持调用setwebviewdomain 接口 */
	NOT_SUPPORT_SETWEBVIEWDOMAIN(89231),



	/** 卡券已被核销 */
	COUPON_USED(91004),
	/** 无效的code */
	INVALID_CODE(91011),
	/** 缺少卡券详情 */
	MISS_COUPONDESC(91014),
	/** 代金券缺少least_cost或者reduce_cost参数 */
	VOUCHER_MISS_LEASTCOSTORREDUCECOST(91014),
	/** 折扣券缺少discount参数 */
	MISS_COUPONDISCOUNT(91016),
	/** 礼品券缺少gift参数 */
	MISS_COUPONGIFT(91017),
	/** 缺少卡券sku参数 */
	MISS_COUPONSKU(91019),
	/** 缺少卡券有效期 */
	MISS_COUPONVALIDATEPERIOD(91020),
	/** 缺少卡券有效期类型 */
	MISS_COUPONVALIDATEPERIODTYPE(91021),
	/** 缺少卡券logo_url */
	MISS_COUPONLOGOURL(91022),
	/** 缺少卡券code类型 */
	MISS_COUPONCODETYPE(91023),
	/** 缺少卡券title */
	MISS_COUPONTITLE(91025),
	/** 缺少卡券color */
	MISS_COUPONCOLOR(91026),
	/** 缺少card_id */
	MISS_CARDID(91029),
	/** 缺少卡券code */
	MISS_COUPONCODE(91030),
	/** 缺少卡券notice */
	MISS_NOTICE(91031),
	/** 不合法的卡券id */
	MISS_COUPONID(91039),
	/**	未绑定的小程序 */
	UNKNOWN_UNUSUAL_DEFINED_WXP(92004),
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
	MISS_REQUESTSOURCE(91059),
	/**
	 * 小程序帐号上传错误
	 */
	ERROR_UPLOAD(91060),
	/**
	 * 超管已被删除
	 */
	MISS_SUPER_ADMIN(91061);

	private final Integer value;

	private HttpCode(Integer value) {
		this.value = value;
	}

	/**
	 * Return the integer value of this status code.
	 */
	public Integer value() {
		return this.value;
	}

	public String msg() {
		return "HTTPCODE_" + this.value;
	}

	public String toString() {
		return this.value.toString();
	}
}
