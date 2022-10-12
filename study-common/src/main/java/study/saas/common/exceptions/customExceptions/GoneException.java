 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class GoneException extends BaseException {

    public GoneException() {
    }

    public GoneException(Throwable ex) {
        super(ex);
    }

    public GoneException(String message) {
        super(message);
    }

    public GoneException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.GONE;
    }
}
