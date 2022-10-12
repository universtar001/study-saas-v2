 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidRequestformatException extends BaseException {

    public InvalidRequestformatException() {
    }

    public InvalidRequestformatException(Throwable ex) {
        super(ex);
    }

    public InvalidRequestformatException(String message) {
        super(message);
    }

    public InvalidRequestformatException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_REQUESTFORMAT;
    }
}
