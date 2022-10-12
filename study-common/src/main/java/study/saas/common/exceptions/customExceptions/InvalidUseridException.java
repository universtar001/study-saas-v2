 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidUseridException extends BaseException {

    public InvalidUseridException() {
    }

    public InvalidUseridException(Throwable ex) {
        super(ex);
    }

    public InvalidUseridException(String message) {
        super(message);
    }

    public InvalidUseridException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_USERID;
    }
}
