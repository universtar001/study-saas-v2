 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class NotRollBackException extends BaseException {

    public NotRollBackException() {
    }

    public NotRollBackException(Throwable ex) {
        super(ex);
    }

    public NotRollBackException(String message) {
        super(message);
    }

    public NotRollBackException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOT_ROLL_BACK;
    }
}
