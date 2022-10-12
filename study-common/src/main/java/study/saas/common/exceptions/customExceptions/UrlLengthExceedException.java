 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class UrlLengthExceedException extends BaseException {

    public UrlLengthExceedException() {
    }

    public UrlLengthExceedException(Throwable ex) {
        super(ex);
    }

    public UrlLengthExceedException(String message) {
        super(message);
    }

    public UrlLengthExceedException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.URLLENGTH_EXCEED;
    }
}
