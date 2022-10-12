 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidFiletypeException extends BaseException {

    public InvalidFiletypeException() {
    }

    public InvalidFiletypeException(Throwable ex) {
        super(ex);
    }

    public InvalidFiletypeException(String message) {
        super(message);
    }

    public InvalidFiletypeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_FILETYPE;
    }
}
