 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidAccessException extends BaseException {

    public InvalidAccessException() {
    }

    public InvalidAccessException(Throwable ex) {
        super(ex);
    }

    public InvalidAccessException(String message) {
        super(message);
    }

    public InvalidAccessException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_ACCESS_TOKEN;
    }
}
