package study.saas.common.exceptions;

import study.saas.common.enumutil.BaseExceptionEnum;
import study.saas.common.enumutil.OperationExceptionEnum;

/**
 * @author even
 * @Title: OperationException
 * @Description: TODO
 * @date 2019/6/51:33 PM
 */
public class OperationException extends RuntimeException {
    private String code;

    /**
     * 继承exception，加入错误状态值
     *
     * @param exceptionEnum
     */
    public OperationException(BaseExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
    }

    /**
     * 自定义信息，不知定义编码
     *
     * @param exceptionEnum
     */
    public OperationException(BaseExceptionEnum exceptionEnum, String message) {
        super(message);
        this.code = exceptionEnum.getCode();
    }

    public OperationException(String number) {
        super(OperationExceptionEnum.of(number));
        this.code = number;
    }

    /**
     * 自定义错误信息
     *
     * @param message
     * @param code
     */
    public OperationException(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
