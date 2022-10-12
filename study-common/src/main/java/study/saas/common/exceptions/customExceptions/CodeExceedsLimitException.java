 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class CodeExceedsLimitException extends BaseException {

    public CodeExceedsLimitException() {
    }

    public CodeExceedsLimitException(Throwable ex) {
        super(ex);
    }

    public CodeExceedsLimitException(String message) {
        super(message);
    }

    public CodeExceedsLimitException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.CODE_EXCEEDS_LIMIT;
    }
}
