 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class NoAuditVersionException extends BaseException {

    public NoAuditVersionException() {
    }

    public NoAuditVersionException(Throwable ex) {
        super(ex);
    }

    public NoAuditVersionException(String message) {
        super(message);
    }

    public NoAuditVersionException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NO_AUDIT_VERSION;
    }
}
