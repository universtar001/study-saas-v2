 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissCardidException extends BaseException {

    public MissCardidException() {
    }

    public MissCardidException(Throwable ex) {
        super(ex);
    }

    public MissCardidException(String message) {
        super(message);
    }

    public MissCardidException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_CARDID;
    }
}
