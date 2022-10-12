 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class RequestTimeoutException extends BaseException {

    public RequestTimeoutException() {
    }

    public RequestTimeoutException(Throwable ex) {
        super(ex);
    }

    public RequestTimeoutException(String message) {
        super(message);
    }

    public RequestTimeoutException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.REQUEST_TIMEOUT;
    }
}
