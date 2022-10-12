 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissContentException extends BaseException {

    public MissContentException() {
    }

    public MissContentException(Throwable ex) {
        super(ex);
    }

    public MissContentException(String message) {
        super(message);
    }

    public MissContentException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_CONTENT;
    }
}
