 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissCouponTitleException extends BaseException {

    public MissCouponTitleException() {
    }

    public MissCouponTitleException(Throwable ex) {
        super(ex);
    }

    public MissCouponTitleException(String message) {
        super(message);
    }

    public MissCouponTitleException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_COUPONTITLE;
    }
}
