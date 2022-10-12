 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class NeedAuthorizeException extends BaseException {

    public NeedAuthorizeException() {
    }

    public NeedAuthorizeException(Throwable ex) {
        super(ex);
    }

    public NeedAuthorizeException(String message) {
        super(message);
    }

    public NeedAuthorizeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NEED_AUTHORIZE;
    }
}
