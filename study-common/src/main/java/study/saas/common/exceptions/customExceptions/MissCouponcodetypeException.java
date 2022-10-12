 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissCouponcodetypeException extends BaseException {

    public MissCouponcodetypeException() {
    }

    public MissCouponcodetypeException(Throwable ex) {
        super(ex);
    }

    public MissCouponcodetypeException(String message) {
        super(message);
    }

    public MissCouponcodetypeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_COUPONCODETYPE;
    }
}
