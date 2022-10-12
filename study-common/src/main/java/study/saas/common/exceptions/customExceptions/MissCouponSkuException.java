 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissCouponSkuException extends BaseException {

    public MissCouponSkuException() {
    }

    public MissCouponSkuException(Throwable ex) {
        super(ex);
    }

    public MissCouponSkuException(String message) {
        super(message);
    }

    public MissCouponSkuException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_COUPONSKU;
    }
}
