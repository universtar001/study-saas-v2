 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class DescSizeExceedException extends BaseException {

    public DescSizeExceedException() {
    }

    public DescSizeExceedException(Throwable ex) {
        super(ex);
    }

    public DescSizeExceedException(String message) {
        super(message);
    }

    public DescSizeExceedException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.DESCSIZE_EXCEED;
    }
}
