package cn.stylefeng.guns.core.api;

public enum ResultCode  implements ICode {

    //系统类
    SYS_NORNAL(0, "正常"),
    SYS_ERROR(1, "服务器开小差了，(╥﹏╥)"),
    SYS_DATA_ERROR(2, "数据走丢了，(╥﹏╥)"),
    PARAM_CHECK_ERROR(3, "参数校验异常"),
    SYS_CUSTOM_ERROR(4, "自定义异常"),
    SIGN_ERROR(5, "签名校验失败"),
    TOKEN_EXPIRED_OR_ERROR(6, "token不存在或已过期"),
    TOKEN_CHECK_ERROR(7, "token验证失败"),
    TOKEN_EXPIRED(8, "token过期"),
    OSS_TOKEN_ERROR(9, "OSS token获取失败"),
    WX_TOKEN_ERROR(10, "微信认证失败"),
    PARAM_DECODE_ERROR(11, "参数解析异常"),
    DATE_PARSE_ERROR(12, "时间解析异常"),
    DATE_REAPEAT_ERROR(13, "数据重复添加异常"),
    VERSION_FORCED_UPGRADE(14,"客户端版本过低，请升级至最新版本"),
    SYS_COMMINTING_ERROR(15,"正在提交,请稍后"),
    SYS_BUSY(16,"系统繁忙，请稍后再试"),
    
    
    //用户类
    USER_NOT_EXIST(100, "用户不存在"),
    USER_EXIST(101, "用户已经存在"),
    USER_CHECKCODE_ERROR(102, "验证码错误，请重新输入"),
    USER_CHECKCODE_EXPIRE_ERROR(103, "验证码已过期，请重新输入"),
    USER_DISABLED(104, "用户未启用,请联系客服"),
    USER_LOGIN_PASSWORD_ERROR(105, "密码错误，请重新输入"),
    USER_LOGIN_USERNAME_NOT_EXIST(106, "您输入的账号不存在，请重新输入"),
    USER_MOBILE_NOT_EXIST(107,"用户手机号未完善"),
    USER_NOMUST_PERMISSION(109,"你没有权限"),
    USER_NO_BANK_CARD(112,"没有绑定银行卡"),
    USER_MONEY_NO_ENOUGH(113,"用户余额不足"),
    USER_WITHDRAW_FAIL(114,"提现失败"),
    USER_PHONE_CHECK_FAIL(115,"手机号格式不正确"),
    USER_PUSH_NOTONES(116,"不能重复提交"),
    USER_WITHDRAW_WAIT(117,"你的提现申请已提交，请等待1-3个工作日"),
    USER_WITHDRAW_NOT_SUPPORT(118,"暂不支持该提现方式"),
    USER_BANK_CARD_NOT_SUPPORT(119,"暂未开通"),
    USER_BANK_CARD_CHECK_FAILD(120,"银行卡校验失败"),
    USER_BANK_CARD_TYPE_CC_NOT_ALLOWED(121,"请绑定储蓄卡"),
    USER_BANK_CARD_NOT_MATCH(122,"输入银行卡号与选择的银行不匹配"),
    USER_BANK_CARD_EXIST(123,"已经存在该类型提现方式"),
    USER_BANK_NOT_BIND_WX(124,"提现方式未绑定微信"),
    USER_BANK_NOT_BIND_ALIPAY(125,"提现方式未绑定支付宝"),
    USER_BANK_WECHAT_NOT_ENPUHG(126,"提现超额"),
    SER_BANK_WECHAT_FAIL(127,"微信提现失败"),
    SER_BANK_CARD_WITHDRAWAL_LOWEST(128,"银行卡提现金额必须大于5元"),
    SER_BANK_WECHAT_WITHDRAWAL_LOWEST(129,"微信提现金额必须大于等于1元"),
    USER_DATA_ERROR(130,"用户数据异常"),
    USER_PASS_REG(131,"用户已通过审核"),
    USER_NOT_ALLOWED(132,"用户没有权限"),
    USER_PROJECT_EXIT(136,"该手机号已绑定报备人"),
    USER_REG_RJECT(137,"该用户已被拒绝通过审核"),


	GOODS_NOT_EXIST(200,"商品不存在"),
	GOODS_CART_NOT_EXIST(201,"购物车商品不存在或已提交"),
	GOODS_PRICE_ERROR(202,"价格参数异常"),
	GOODS_HAS_BEEN_UP(203,"商品已上架"),
	GOODS_BRAND_SHOP(204,"店铺的品牌达到上限"),
    GOODS_NOT_SET_INSTALLATION_FEE(205,"商品未设置物流费或安装费"),
	
	
	

	BRAND_NOT_EXIST(300,"店铺不存在"),
	BRAND_NOT_EXIST_LOGSTIC(301,"物流费用未维护"),
    BRAND_NOT_EXIST_OWN(302,"该店铺不存在服务经理"),
    BRAND_SHOP_PASS_REG(303,"店铺已审核通过"),
	
	
	ORDER_TIME_OUT(400,"订单已失效或已过期"),
	ORDER_CAN_NOT_CANCEL(401,"订单已支付，不能取消"),
	ORDER_NOT_EXIST(402,"订单不存在"),
	ORDER_COMMITING(403,"订单正在提交，请稍后"),
	ORDER_EXECUTE_ERROR(404,"当前订单状态执行该操作失败"),
	ORDER_REFUND_FAILD(406,"退款失败，请联系客服"),
	ORDER_LESS_DEPOSIT(407,"商品金额小于之前定金金额，修改失败"),
	ORDER_DISPATCH_DATE_TIMEOUT(408,"接单超时"),
	ORDER_NOT_EDIT(409,"存在未编辑订单"),
	ORDER_HAS_CHECK(410,"订单已验货"),
    ORDER_MUST_NOT_ENOUGH(412,"订单必须存在商品"),
    ORDER_MUST_HAS_ONE(413,"订单必须存在商品"),
    ORDER_DETAIL_NOT_EXIST(414,"订单详情不存在"),
    ORDER_USER_ADDRESS_NOT_EXIST(415,"收货地址不存在"),
    ORDER_NOT_EXIST_OR_HAS_DISPATCH(416,"订单不存在或已处理"),
    DISPATCH_NOT_EXIST_OR_HAS_DISPATCH(417,"工单不存在或已处理"),
    ORDER_USER_NOT_MATCH_COMMIT_USER(418,"订单所属用户与提交用户不匹配"),
    ORDER_CAN_NOT_DEL(419,"订单未完成，不能删除"),
    ORDER_CAN_NOT_REFUND(420,"订单不能退款"),
    ORDER_CAN_NOT_CONFIRM(421,"请等待送达之后再确认"),
    ORDER_CAN_NOT_COMMENT(422,"订单未完成，不能评价"),
    ORDER_CAN_NOT_AFTER_SERVICE(423,"订单未完成，不能提交售后服务"),
    ORDER_SERVICE_TIME_OUT(424,"售后服务已过期"),
    ORDER_HAS_EXIST_SERVICE(425,"订单已存在售后"),

	//添加银行卡信息的错误信息
	BANK_USER_NAME_NULL(501,"姓名不能为空"),
	BANK_NAME_NULL(502,"银行名称或者开户网点不能为空"),
	BANK_NUMBER_NULL(503,"卡号不能为空"),
	BANK_USER_MOBILE_NULL(504,"手机号不能为空"),
	BANK_NUMBER_CHECK_FAIL(505,"银行卡号不合法"),
	BANK_USER_MOBILE_CHECK_FAIL(506,"手机号不合法"),
	
	//用户派单确认信息异常
	USER_INSTALLATION_COMPARE_ERROR(601,"接单截止时间不能小于预约开始时间"),
	USER_REVER_COMPARE_ERROR(601,"预约开始时间不能大于预约结束时间"),
	
	//微信手机号授权信息
	WET_CHAT_PHONE_AUTH(701,"该手机号未进行授权"),
	WET_CHAT_GET_USERINFO_FAIL(702,"获取用户信息失败"),
	WET_CHAT_CODE_ISNULL(703,"code值不能空"),
	WET_CHAT_USER_ISOLD(704,"该用户是老用户"),
	WET_CHAT_ROLE_ERROR(705,"该链接不是相应的角色发的不能领取积分和红包"),
	WET_CHAT_ROLE_ISNEW(706,"该用户是新用户"),
	WET_CHAT_DATA_NOTINIT(707,"红包数据未初始化不能领取"),
	WET_CHAT_PID_ISNULL(708,"推荐人id不能为空"),
	WET_CHAT_MONEY_ISNULL(709,"提取的佣金余额不能为空"),
	WET_CHAT_COMPARAE(710,"输入的提现金额不能大于佣金余额"),
	WET_CHAT_PID_NOT_EXISTS(711,"推荐人已经被删除"),
	WET_CHAT_IS_AUTH(712,"该手机号已经在app端已经授权"),
	WET_CHAT_UNIONID_ISNULL(713,"该用户是新用户获取不到unionid"),
	WET_CHAT_GET_UNIONID_FAIL(714,"从密文中获取unionid失败"),
	WET_CHAT_REFERRER_NOT_EXIST(715,"推荐人不存在"),
	
	ESCORG_NOT_SERVICE(802,"该区域暂未开放"),
    ESC_LOGISTICS_CHARGE_HAS_SET(803,"物流费已经设置"),
    ESCORG_OUT_RANGE(804,"该区域不在经营范围内"),


	USER_DECORATION_TYPE_IS_NULL(904,"装修人员类型不能为空"),
	USER_DECORATION_NAME_IS_NULL(905,"装修人员姓名不能为空"),
	USER_DECORATION_MOBILE_IS_NULL(906,"装修人员联系方式不能为空"),
	USER_DECORATION_TIME_IS_NULL(907,"装修人员从业时间不能为空"),
	USER_DECORATION_ISEXISTS(908,"装修人员已经存在,请更换手机重新操作"),


	FACTORY_INFO_NOT_EXIST(1001, "企业厂家不存在");
	
	
	
    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;

    private String message;

    @Override
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
