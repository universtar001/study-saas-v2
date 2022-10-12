 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class LockedException extends BaseException {

    public LockedException() {
    }

    public LockedException(Throwable ex) {
        super(ex);
    }

    public LockedException(String message) {
        super(message);
    }

    public LockedException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.LOCKED;
    }
}
