 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissCouponValidatePeriodTypeException extends BaseException {

    public MissCouponValidatePeriodTypeException() {
    }

    public MissCouponValidatePeriodTypeException(Throwable ex) {
        super(ex);
    }

    public MissCouponValidatePeriodTypeException(String message) {
        super(message);
    }

    public MissCouponValidatePeriodTypeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_COUPONVALIDATEPERIODTYPE;
    }
}
