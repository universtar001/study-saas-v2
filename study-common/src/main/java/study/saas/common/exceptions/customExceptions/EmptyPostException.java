 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class EmptyPostException extends BaseException {

    public EmptyPostException() {
    }

    public EmptyPostException(Throwable ex) {
        super(ex);
    }

    public EmptyPostException(String message) {
        super(message);
    }

    public EmptyPostException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.EMPTY_POST;
    }
}
