 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissCouponGiftException extends BaseException {

    public MissCouponGiftException() {
    }

    public MissCouponGiftException(Throwable ex) {
        super(ex);
    }

    public MissCouponGiftException(String message) {
        super(message);
    }

    public MissCouponGiftException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_COUPONGIFT;
    }
}
