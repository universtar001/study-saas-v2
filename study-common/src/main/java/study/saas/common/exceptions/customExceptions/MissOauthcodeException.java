 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissOauthcodeException extends BaseException {

    public MissOauthcodeException() {
    }

    public MissOauthcodeException(Throwable ex) {
        super(ex);
    }

    public MissOauthcodeException(String message) {
        super(message);
    }

    public MissOauthcodeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_OAUTHCODE;
    }
}
