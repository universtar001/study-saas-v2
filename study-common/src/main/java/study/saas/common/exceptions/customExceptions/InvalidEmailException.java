 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidEmailException extends BaseException {

    public InvalidEmailException() {
    }

    public InvalidEmailException(Throwable ex) {
        super(ex);
    }

    public InvalidEmailException(String message) {
        super(message);
    }

    public InvalidEmailException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_EMAIL;
    }
}
