 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidMenulevelException extends BaseException {

    public InvalidMenulevelException() {
    }

    public InvalidMenulevelException(Throwable ex) {
        super(ex);
    }

    public InvalidMenulevelException(String message) {
        super(message);
    }

    public InvalidMenulevelException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_MENULEVEL;
    }
}
