 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissUserInfoException extends BaseException {

    public MissUserInfoException() {
    }

    public MissUserInfoException(Throwable ex) {
        super(ex);
    }

    public MissUserInfoException(String message) {
        super(message);
    }

    public MissUserInfoException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_USERINFO;
    }
}
