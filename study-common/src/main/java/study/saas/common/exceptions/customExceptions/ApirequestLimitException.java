 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ApirequestLimitException extends BaseException {

    public ApirequestLimitException() {
    }

    public ApirequestLimitException(Throwable ex) {
        super(ex);
    }

    public ApirequestLimitException(String message) {
        super(message);
    }

    public ApirequestLimitException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.APIREQUEST_LIMIT;
    }
}
