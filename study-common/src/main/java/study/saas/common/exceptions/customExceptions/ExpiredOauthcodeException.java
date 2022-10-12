 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ExpiredOauthcodeException extends BaseException {

    public ExpiredOauthcodeException() {
    }

    public ExpiredOauthcodeException(Throwable ex) {
        super(ex);
    }

    public ExpiredOauthcodeException(String message) {
        super(message);
    }

    public ExpiredOauthcodeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.EXPIRED_OAUTHCODE;
    }
}
