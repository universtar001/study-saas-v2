 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class DeptWithEmployeeDeleteException extends BaseException {

    public DeptWithEmployeeDeleteException() {
    }

    public DeptWithEmployeeDeleteException(Throwable ex) {
        super(ex);
    }

    public DeptWithEmployeeDeleteException(String message) {
        super(message);
    }

    public DeptWithEmployeeDeleteException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.DEPTWITHEMPLOYEE_DELETE_NOTALLOWED;
    }
}
