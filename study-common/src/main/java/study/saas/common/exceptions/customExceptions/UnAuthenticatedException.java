 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class UnAuthenticatedException extends BaseException {

    public UnAuthenticatedException() {
    }

    public UnAuthenticatedException(Throwable ex) {
        super(ex);
    }

    public UnAuthenticatedException(String message) {
        super(message);
    }

    public UnAuthenticatedException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.UNAUTHENTICATED;
    }
}
