 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissAccessTokenException extends BaseException {

    public MissAccessTokenException() {
    }

    public MissAccessTokenException(Throwable ex) {
        super(ex);
    }

    public MissAccessTokenException(String message) {
        super(message);
    }

    public MissAccessTokenException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_ACCESSTOKEN;
    }
}
