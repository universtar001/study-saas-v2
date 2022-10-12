 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class DeptLevelLimitException extends BaseException {

    public DeptLevelLimitException() {
    }

    public DeptLevelLimitException(Throwable ex) {
        super(ex);
    }

    public DeptLevelLimitException(String message) {
        super(message);
    }

    public DeptLevelLimitException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.DEPTLEVEL_LIMIT;
    }
}
