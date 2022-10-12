 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class DeptWithChildDeleteNotAllowedException extends BaseException {

    public DeptWithChildDeleteNotAllowedException() {
    }

    public DeptWithChildDeleteNotAllowedException(Throwable ex) {
        super(ex);
    }

    public DeptWithChildDeleteNotAllowedException(String message) {
        super(message);
    }

    public DeptWithChildDeleteNotAllowedException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.DEPTWITHCHILDDELETE_NOTALLOWED;
    }
}
