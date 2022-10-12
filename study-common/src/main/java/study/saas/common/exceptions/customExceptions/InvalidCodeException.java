 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidCodeException extends BaseException {

    public InvalidCodeException() {
    }

    public InvalidCodeException(Throwable ex) {
        super(ex);
    }

    public InvalidCodeException(String message) {
        super(message);
    }

    public InvalidCodeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_CODE;
    }
}
