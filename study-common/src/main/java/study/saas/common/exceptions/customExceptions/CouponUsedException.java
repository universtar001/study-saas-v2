 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class CouponUsedException extends BaseException {

    public CouponUsedException() {
    }

    public CouponUsedException(Throwable ex) {
        super(ex);
    }

    public CouponUsedException(String message) {
        super(message);
    }

    public CouponUsedException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.COUPON_USED;
    }
}
