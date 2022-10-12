 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ParentdeptidNotfoundException extends BaseException {

    public ParentdeptidNotfoundException() {
    }

    public ParentdeptidNotfoundException(Throwable ex) {
        super(ex);
    }

    public ParentdeptidNotfoundException(String message) {
        super(message);
    }

    public ParentdeptidNotfoundException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.PARENTDEPTID_NOTFOUND;
    }
}
