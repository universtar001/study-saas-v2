 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidMediaidException extends BaseException {

    public InvalidMediaidException() {
    }

    public InvalidMediaidException(Throwable ex) {
        super(ex);
    }

    public InvalidMediaidException(String message) {
        super(message);
    }

    public InvalidMediaidException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_MEDIAID;
    }
}
