 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissProductPinException extends BaseException {

    public MissProductPinException() {
    }

    public MissProductPinException(Throwable ex) {
        super(ex);
    }

    public MissProductPinException(String message) {
        super(message);
    }

    public MissProductPinException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_PRODUCTPIN;
    }
}
