 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class BelowPreviouslyRatioException extends BaseException {

    public BelowPreviouslyRatioException() {
    }

    public BelowPreviouslyRatioException(Throwable ex) {
        super(ex);
    }

    public BelowPreviouslyRatioException(String message) {
        super(message);
    }

    public BelowPreviouslyRatioException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.BELOW_PREVIOUSLY_RATIO;
    }
}
