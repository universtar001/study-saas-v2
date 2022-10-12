 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidOauthcodeException extends BaseException {

    public InvalidOauthcodeException() {
    }

    public InvalidOauthcodeException(Throwable ex) {
        super(ex);
    }

    public InvalidOauthcodeException(String message) {
        super(message);
    }

    public InvalidOauthcodeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_OAUTHCODE;
    }
}
