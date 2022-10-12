 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidMenutypeException extends BaseException {

    public InvalidMenutypeException() {
    }

    public InvalidMenutypeException(Throwable ex) {
        super(ex);
    }

    public InvalidMenutypeException(String message) {
        super(message);
    }

    public InvalidMenutypeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_MENUTYPE;
    }
}
