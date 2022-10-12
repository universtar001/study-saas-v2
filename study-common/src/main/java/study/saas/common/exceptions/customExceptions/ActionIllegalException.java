 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ActionIllegalException extends BaseException {

    public ActionIllegalException() {
    }

    public ActionIllegalException(Throwable ex) {
        super(ex);
    }

    public ActionIllegalException(String message) {
        super(message);
    }

    public ActionIllegalException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.ACTION_ILLEGAL;
    }
}
