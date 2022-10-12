 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissCouponDiscountException extends BaseException {

    public MissCouponDiscountException() {
    }

    public MissCouponDiscountException(Throwable ex) {
        super(ex);
    }

    public MissCouponDiscountException(String message) {
        super(message);
    }

    public MissCouponDiscountException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_COUPONDISCOUNT;
    }
}
