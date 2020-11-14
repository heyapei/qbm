package com.hyp.qbm.exception.result;

/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2020/7/9 22:22
 * @Description: TODO 作为所有的数据返回码的类
 */
public enum MyResultCode {

    /**
     * 状态
     */
    OK("200", "请求成功"),
    BAD_REQUEST("400", "错误的请求"),
    UNAUTHORIZED("401", "禁止访问"),
    NOT_FOUND("404", "没有可用的数据"),
    PWD_EEOR("300", "密码错误"),
    EXIT("403", "已经存在"),
    INTERNAL_SERVER_ERROR("500", "服务器遇到了一个未曾预料的状况"),
    SERVICE_UNAVAILABLE("503", "服务器当前无法处理请求"),
    ERROR("9999", "数据不能为空"),
    /* 令牌失效 */
    TOKEN_INVALID("401", "令牌失效"),
    SERVER_ERROR("400", "服务器错误"),
    /*参数错误 10001-19999 */
    PARAM_IS_INVALID("10001", "参数无效"),
    PARAM_IS_BLANK("10002", "参数为空"),
    PARAM_TYPE_BIND_ERROR("10003", "参数类型错误"),
    PARAM_NOT_COMPLETE("10004", "参数缺失"),

    /* 用户错误：20001-29999*/
    USER_NOT_LOGGED_IN("20001", "用户未登录"),
    USER_LOGIN_ERROR("20002", "账号不存在或密码错误"),
    USER_ACCOUNT_FORBIDDEN("20003", "账号已被禁用"),
    USER_NOT_EXIST("20004", "用户不存在"),
    USER_HAS_EXISTED("20005", "用户已存在"),
    Cert_HAS_EXISTED("20006", "认证已存在"),


    /* 业务错误：30001-39999 */
    CREATE_FAIL("30001", "创建失败"),


    /* 系统错误：40001-49999 */
    SYSTEM_INNER_ERROR("40001", "系统繁忙，请稍后重试"),


    /* 数据错误：50001-599999 */
    RESULE_DATA_NONE("50001", "数据未找到"),
    DATA_IS_WRONG("50002", "数据有误"),
    DATA_ALREADY_EXISTED("50003", "数据已存在"),


    /* 接口错误：60001-69999 */
    INTERFACE_INNER_INVOKE_ERROR("60001", "内部系统接口调用异常"),
    INTERFACE_OUTTER_INVOKE_ERROR("60002", "外部系统接口调用异常"),
    INTERFACE_FORBID_VISIT("60003", "该接口禁止访问"),
    INTERFACE_ADDRESS_INVALID("60004", "接口地址无效"),
    INTERFACE_REQUEST_TIMEOUT("60005", "接口请求超时"),
    INTERFACE_EXCEED_LOAD("60006", "接口负载过高"),


    /* 权限错误：70001-79999 */
    PERMISSION_NO_ACCESS("70001", "只有标签 Owner ,才具备删除权限"),
    PERMISSION_NO_PHONE_ACCESS("70002", "此认证标签已有员工认证，不可以进行删除");


    /**
     * 状态码,长度固定为6位的字符串.
     */
    private String statusCode;

    /**
     * 错误信息.
     */
    private String statusMessage;

    MyResultCode(String statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public String getCode() {
        return statusCode;
    }

    public String getReason() {
        return statusMessage;
    }

    @Override
    public String toString() {
        return statusCode + ": " + statusMessage;
    }

}
