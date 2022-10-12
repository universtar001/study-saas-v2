 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissUrlException extends BaseException {

    public MissUrlException() {
    }

    public MissUrlException(Throwable ex) {
        super(ex);
    }

    public MissUrlException(String message) {
        super(message);
    }

    public MissUrlException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_URL;
    }
}
