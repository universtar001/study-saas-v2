 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissCouponValidatePeriodException extends BaseException {

    public MissCouponValidatePeriodException() {
    }

    public MissCouponValidatePeriodException(Throwable ex) {
        super(ex);
    }

    public MissCouponValidatePeriodException(String message) {
        super(message);
    }

    public MissCouponValidatePeriodException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_COUPONVALIDATEPERIOD;
    }
}
