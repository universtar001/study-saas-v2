 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidUpdatefailException extends BaseException {

    public InvalidUpdatefailException() {
    }

    public InvalidUpdatefailException(Throwable ex) {
        super(ex);
    }

    public InvalidUpdatefailException(String message) {
        super(message);
    }

    public InvalidUpdatefailException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_UPDATEFAIL;
    }
}
