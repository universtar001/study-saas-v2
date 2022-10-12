package study.saas.common.exceptions;

import study.saas.common.enumutil.ExceptionEnum;

public class DescribeException extends RuntimeException{

    private Integer code;

    /**
     * 继承exception，加入错误状态值
     * @param exceptionEnum
     */
    public DescribeException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
    }

    /**
     * 自定义信息，不知定义编码
     * @param exceptionEnum
     */
    public DescribeException(ExceptionEnum exceptionEnum,String message) {
        super(message);
        this.code = exceptionEnum.getCode();
    }

    public DescribeException(int number){
       super(ExceptionEnum.of(number));
       this.code = number;
    }

    /**
     * 自定义错误信息
     * @param message
     * @param code
     */
    public DescribeException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}