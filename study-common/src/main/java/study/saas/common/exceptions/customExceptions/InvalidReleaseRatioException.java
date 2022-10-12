 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidReleaseRatioException extends BaseException {

    public InvalidReleaseRatioException() {
    }

    public InvalidReleaseRatioException(Throwable ex) {
        super(ex);
    }

    public InvalidReleaseRatioException(String message) {
        super(message);
    }

    public InvalidReleaseRatioException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_RELEASE_RATIO;
    }
}
