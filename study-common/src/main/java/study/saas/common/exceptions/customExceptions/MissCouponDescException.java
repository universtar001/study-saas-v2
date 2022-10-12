 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissCouponDescException extends BaseException {

    public MissCouponDescException() {
    }

    public MissCouponDescException(Throwable ex) {
        super(ex);
    }

    public MissCouponDescException(String message) {
        super(message);
    }

    public MissCouponDescException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_COUPONDESC;
    }
}
