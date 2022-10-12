 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissDescException extends BaseException {

    public MissDescException() {
    }

    public MissDescException(Throwable ex) {
        super(ex);
    }

    public MissDescException(String message) {
        super(message);
    }

    public MissDescException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_DESC;
    }
}
