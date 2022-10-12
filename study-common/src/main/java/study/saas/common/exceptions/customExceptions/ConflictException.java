 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ConflictException extends BaseException {

    public ConflictException() {
    }

    public ConflictException(Throwable ex) {
        super(ex);
    }

    public ConflictException(String message) {
        super(message);
    }

    public ConflictException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.CONFLICT;
    }
}
