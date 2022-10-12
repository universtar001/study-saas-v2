 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissUseridException extends BaseException {

    public MissUseridException() {
    }

    public MissUseridException(Throwable ex) {
        super(ex);
    }

    public MissUseridException(String message) {
        super(message);
    }

    public MissUseridException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_USERID;
    }
}
