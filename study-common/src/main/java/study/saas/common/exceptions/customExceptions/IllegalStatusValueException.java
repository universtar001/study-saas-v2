 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class IllegalStatusValueException extends BaseException {

    public IllegalStatusValueException() {
    }

    public IllegalStatusValueException(Throwable ex) {
        super(ex);
    }

    public IllegalStatusValueException(String message) {
        super(message);
    }

    public IllegalStatusValueException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.ILLEGAL_STATUS_VALUE;
    }
}
