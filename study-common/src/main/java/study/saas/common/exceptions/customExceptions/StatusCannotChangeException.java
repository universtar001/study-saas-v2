 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class StatusCannotChangeException extends BaseException {

    public StatusCannotChangeException() {
    }

    public StatusCannotChangeException(Throwable ex) {
        super(ex);
    }

    public StatusCannotChangeException(String message) {
        super(message);
    }

    public StatusCannotChangeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.STATUS_CANNOT_CHANGE;
    }
}
