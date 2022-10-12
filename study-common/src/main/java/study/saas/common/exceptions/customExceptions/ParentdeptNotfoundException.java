 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ParentdeptNotfoundException extends BaseException {

    public ParentdeptNotfoundException() {
    }

    public ParentdeptNotfoundException(Throwable ex) {
        super(ex);
    }

    public ParentdeptNotfoundException(String message) {
        super(message);
    }

    public ParentdeptNotfoundException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.PARENTDEPT_NOTFOUND;
    }
}
