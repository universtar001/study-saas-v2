 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class RootDeptDeleteNotAllowedException extends BaseException {

    public RootDeptDeleteNotAllowedException() {
    }

    public RootDeptDeleteNotAllowedException(Throwable ex) {
        super(ex);
    }

    public RootDeptDeleteNotAllowedException(String message) {
        super(message);
    }

    public RootDeptDeleteNotAllowedException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.ROOTDEPTDELETE_NOTALLOWED;
    }
}
