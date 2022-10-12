 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class DeptidNotFoundException extends BaseException {

    public DeptidNotFoundException() {
    }

    public DeptidNotFoundException(Throwable ex) {
        super(ex);
    }

    public DeptidNotFoundException(String message) {
        super(message);
    }

    public DeptidNotFoundException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.DEPTID_NOTFOUND;
    }
}
