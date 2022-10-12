 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ExpiredProductTimeException extends BaseException {

    public ExpiredProductTimeException() {
    }

    public ExpiredProductTimeException(Throwable ex) {
        super(ex);
    }

    public ExpiredProductTimeException(String message) {
        super(message);
    }

    public ExpiredProductTimeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.EXPIRED_PRODUCTTIME;
    }
}
