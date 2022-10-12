 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidAuditIdException extends BaseException {

    public InvalidAuditIdException() {
    }

    public InvalidAuditIdException(Throwable ex) {
        super(ex);
    }

    public InvalidAuditIdException(String message) {
        super(message);
    }

    public InvalidAuditIdException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_AUDIT_ID;
    }
}
