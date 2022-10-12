 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidTitlelengthException extends BaseException {

    public InvalidTitlelengthException() {
    }

    public InvalidTitlelengthException(Throwable ex) {
        super(ex);
    }

    public InvalidTitlelengthException(String message) {
        super(message);
    }

    public InvalidTitlelengthException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_TITLELENGTH;
    }
}
