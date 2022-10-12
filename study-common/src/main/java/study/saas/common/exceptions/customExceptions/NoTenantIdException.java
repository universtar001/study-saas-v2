 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class NoTenantIdException extends BaseException {

    public NoTenantIdException() {
    }

    public NoTenantIdException(Throwable ex) {
        super(ex);
    }

    public NoTenantIdException(String message) {
        super(message);
    }

    public NoTenantIdException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOTENANTID;
    }
}
