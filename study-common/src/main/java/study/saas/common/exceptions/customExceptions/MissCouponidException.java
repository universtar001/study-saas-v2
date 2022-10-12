 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissCouponidException extends BaseException {

    public MissCouponidException() {
    }

    public MissCouponidException(Throwable ex) {
        super(ex);
    }

    public MissCouponidException(String message) {
        super(message);
    }

    public MissCouponidException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_COUPONID;
    }
}
