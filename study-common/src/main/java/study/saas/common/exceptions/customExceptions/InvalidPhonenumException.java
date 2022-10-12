 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidPhonenumException extends BaseException {

    public InvalidPhonenumException() {
    }

    public InvalidPhonenumException(Throwable ex) {
        super(ex);
    }

    public InvalidPhonenumException(String message) {
        super(message);
    }

    public InvalidPhonenumException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_PHONENUM;
    }
}
