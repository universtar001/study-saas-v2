 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class AuditStatusNotFulfilledException extends BaseException {

    public AuditStatusNotFulfilledException() {
    }

    public AuditStatusNotFulfilledException(Throwable ex) {
        super(ex);
    }

    public AuditStatusNotFulfilledException(String message) {
        super(message);
    }

    public AuditStatusNotFulfilledException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.AUDIT_STATUS_NOT_FULFILLED;
    }
}
