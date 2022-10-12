 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidOpenidException extends BaseException {

    public InvalidOpenidException() {
    }

    public InvalidOpenidException(Throwable ex) {
        super(ex);
    }

    public InvalidOpenidException(String message) {
        super(message);
    }

    public InvalidOpenidException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_OPENID;
    }
}
