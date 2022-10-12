 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissCouponLogoUrlException extends BaseException {

    public MissCouponLogoUrlException() {
    }

    public MissCouponLogoUrlException(Throwable ex) {
        super(ex);
    }

    public MissCouponLogoUrlException(String message) {
        super(message);
    }

    public MissCouponLogoUrlException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_COUPONLOGOURL;
    }
}
