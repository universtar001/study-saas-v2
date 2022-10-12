 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class DeptidorNameExistsException extends BaseException {

    public DeptidorNameExistsException() {
    }

    public DeptidorNameExistsException(Throwable ex) {
        super(ex);
    }

    public DeptidorNameExistsException(String message) {
        super(message);
    }

    public DeptidorNameExistsException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.DEPTIDORNAME_EXISTS;
    }
}
