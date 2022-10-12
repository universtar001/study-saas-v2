 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class DeptNotFoundException extends BaseException {

    public DeptNotFoundException() {
    }

    public DeptNotFoundException(Throwable ex) {
        super(ex);
    }

    public DeptNotFoundException(String message) {
        super(message);
    }

    public DeptNotFoundException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.DEPT_NOTFOUND;
    }
}
