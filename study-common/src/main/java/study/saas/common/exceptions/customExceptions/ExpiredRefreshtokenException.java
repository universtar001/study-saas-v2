 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ExpiredRefreshtokenException extends BaseException {

    public ExpiredRefreshtokenException() {
    }

    public ExpiredRefreshtokenException(Throwable ex) {
        super(ex);
    }

    public ExpiredRefreshtokenException(String message) {
        super(message);
    }

    public ExpiredRefreshtokenException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.EXPIRED_REFRESHTOKEN;
    }
}
