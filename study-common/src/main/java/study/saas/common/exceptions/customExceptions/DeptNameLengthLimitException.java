 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class DeptNameLengthLimitException extends BaseException {

    public DeptNameLengthLimitException() {
    }

    public DeptNameLengthLimitException(Throwable ex) {
        super(ex);
    }

    public DeptNameLengthLimitException(String message) {
        super(message);
    }

    public DeptNameLengthLimitException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.DEPTNAMELENGTH_LIMIT;
    }
}
