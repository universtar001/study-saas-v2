 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class DeptnameDuplicateException extends BaseException {

    public DeptnameDuplicateException() {
    }

    public DeptnameDuplicateException(Throwable ex) {
        super(ex);
    }

    public DeptnameDuplicateException(String message) {
        super(message);
    }

    public DeptnameDuplicateException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.DEPTNAME_DUPLICATE;
    }
}
