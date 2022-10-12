package study.saas.common.viewmodel;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import study.saas.common.exceptions.HttpCode;

import java.io.Serializable;

/**
 * @author Peter on 2017-02-20.
 */
@ApiModel(value = "返回类")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResult<T> implements Serializable {

    @ApiModelProperty(value = "状态码")
    private int code;

    @ApiModelProperty(value = "返回信息描述")
    private Object data;

    @ApiModelProperty(value = "返回实体对象")
    private T message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    public ApiResult() {
        this.code = 1;
    }

    public ApiResult(Object data) {
        this.code = 1;
        this.data = data;
    }

    /**
     * @param code
     * @param data
     * @param message 返回实体数据
     */
    public ApiResult(int code, Object data, T message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public ApiResult(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public ApiResult(HttpCode code) {
        this.code = code.value();
        this.data = null;
    }

    public void setError(Object data) {
        this.code = 0;
        this.data = data;
    }

    public static ApiResult ok() {
        return new ApiResult();
    }

    public static ApiResult ok(Object data) {
        return new ApiResult(data);
    }

    public static ApiResult error() {
        return new ApiResult(0, null);
    }

    public static ApiResult error(Object data) {
        return new ApiResult(0, data);
    }
}
