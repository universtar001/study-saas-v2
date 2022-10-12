 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissTenantIdException extends BaseException {

    public MissTenantIdException() {
    }

    public MissTenantIdException(Throwable ex) {
        super(ex);
    }

    public MissTenantIdException(String message) {
        super(message);
    }

    public MissTenantIdException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_TENANTID;
    }
}
