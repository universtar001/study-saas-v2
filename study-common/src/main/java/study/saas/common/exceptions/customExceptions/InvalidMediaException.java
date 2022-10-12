 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidMediaException extends BaseException {

    public InvalidMediaException() {
    }

    public InvalidMediaException(Throwable ex) {
        super(ex);
    }

    public InvalidMediaException(String message) {
        super(message);
    }

    public InvalidMediaException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_MEDIA;
    }
}
