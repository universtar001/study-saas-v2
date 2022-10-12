 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class CreateDeptFailException extends BaseException {

    public CreateDeptFailException() {
    }

    public CreateDeptFailException(Throwable ex) {
        super(ex);
    }

    public CreateDeptFailException(String message) {
        super(message);
    }

    public CreateDeptFailException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.CREATEDEPT_FAIL;
    }
}
