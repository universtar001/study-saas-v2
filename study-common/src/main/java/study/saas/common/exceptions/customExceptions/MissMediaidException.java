 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissMediaidException extends BaseException {

    public MissMediaidException() {
    }

    public MissMediaidException(Throwable ex) {
        super(ex);
    }

    public MissMediaidException(String message) {
        super(message);
    }

    public MissMediaidException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_MEDIAID;
    }
}
