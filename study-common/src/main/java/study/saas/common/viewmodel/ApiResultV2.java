package study.saas.common.viewmodel;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import study.saas.common.enumutil.BaseExceptionEnum;

import java.io.Serializable;

/**
 * @description: 标准返回类
 * @author: even
 * @create: 2019/5/30 5:32 PM
 **/
@ApiModel(value = "返回类")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResultV2<T> implements Serializable {
    private static final String SUCCESS_CODE = "1";
    private static final String FAIL_CODE = "0";
    private static final String SUCCESS_MESSAGE = "SUCCESS";

    @ApiModelProperty(value = "状态码")
    private String code;

    @ApiModelProperty(value = "返回实体对象")
    private T data;

    @ApiModelProperty(value = "返回信息描述")
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ApiResultV2() {
        this.code = SUCCESS_CODE;
    }

    public ApiResultV2(String message) {
        this.code = SUCCESS_CODE;
        this.message = message;
    }

    public ApiResultV2(String code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public ApiResultV2(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ApiResultV2(BaseExceptionEnum exceptionEnum) {
        this.code = exceptionEnum.getCode();
        this.message = exceptionEnum.getMsg();
    }

    public ApiResultV2 setError(String message) {
        this.code = FAIL_CODE;
        this.message = message;
        return this;
    }

    public boolean isSuccess() {
        return this.code.equals(SUCCESS_CODE);
    }

    public static ApiResultV2 ok() {
        return new ApiResultV2();
    }

    public static <T> ApiResultV2<T> ok(T data) {
        return new ApiResultV2<>(SUCCESS_CODE, data, SUCCESS_MESSAGE);
    }

    public static ApiResultV2 error() {
        return error(FAIL_CODE, null);
    }

    public static ApiResultV2 error(String message) {
        return error(FAIL_CODE, message);
    }

    public static ApiResultV2 error(BaseExceptionEnum exceptionEnum) {
        return error(exceptionEnum.getCode(), exceptionEnum.getMsg());
    }

    public static ApiResultV2 error(String code, String message) {
        return new ApiResultV2<>(code, message);
    }
}
