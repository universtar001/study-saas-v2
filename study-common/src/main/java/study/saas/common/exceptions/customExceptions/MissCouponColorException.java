 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissCouponColorException extends BaseException {

    public MissCouponColorException() {
    }

    public MissCouponColorException(Throwable ex) {
        super(ex);
    }

    public MissCouponColorException(String message) {
        super(message);
    }

    public MissCouponColorException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_COUPONCOLOR;
    }
}
