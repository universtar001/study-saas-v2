 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidAppidException extends BaseException {

    public InvalidAppidException() {
    }

    public InvalidAppidException(Throwable ex) {
        super(ex);
    }

    public InvalidAppidException(String message) {
        super(message);
    }

    public InvalidAppidException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_APPID;
    }
}
