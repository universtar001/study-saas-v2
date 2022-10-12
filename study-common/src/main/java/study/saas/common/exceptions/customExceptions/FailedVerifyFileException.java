 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class FailedVerifyFileException extends BaseException {

    public FailedVerifyFileException() {
    }

    public FailedVerifyFileException(Throwable ex) {
        super(ex);
    }

    public FailedVerifyFileException(String message) {
        super(message);
    }

    public FailedVerifyFileException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.FAILED_VERIFY_FILE;
    }
}
