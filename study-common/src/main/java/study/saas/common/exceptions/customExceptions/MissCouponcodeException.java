 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissCouponcodeException extends BaseException {

    public MissCouponcodeException() {
    }

    public MissCouponcodeException(Throwable ex) {
        super(ex);
    }

    public MissCouponcodeException(String message) {
        super(message);
    }

    public MissCouponcodeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_COUPONCODE;
    }
}
