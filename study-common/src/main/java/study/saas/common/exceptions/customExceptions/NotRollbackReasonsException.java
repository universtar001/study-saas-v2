 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class NotRollbackReasonsException extends BaseException {

    public NotRollbackReasonsException() {
    }

    public NotRollbackReasonsException(Throwable ex) {
        super(ex);
    }

    public NotRollbackReasonsException(String message) {
        super(message);
    }

    public NotRollbackReasonsException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOT_ROLLBACK_REASONS;
    }
}
