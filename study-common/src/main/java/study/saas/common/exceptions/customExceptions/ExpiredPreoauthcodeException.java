 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ExpiredPreoauthcodeException extends BaseException {

    public ExpiredPreoauthcodeException() {
    }

    public ExpiredPreoauthcodeException(Throwable ex) {
        super(ex);
    }

    public ExpiredPreoauthcodeException(String message) {
        super(message);
    }

    public ExpiredPreoauthcodeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.EXPIRED_PREOAUTHCODE;
    }
}
