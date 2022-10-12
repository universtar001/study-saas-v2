 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ExpiredAccesstokenException extends BaseException {

    public ExpiredAccesstokenException() {
    }

    public ExpiredAccesstokenException(Throwable ex) {
        super(ex);
    }

    public ExpiredAccesstokenException(String message) {
        super(message);
    }

    public ExpiredAccesstokenException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.EXPIRED_ACCESSTOKEN;
    }
}
