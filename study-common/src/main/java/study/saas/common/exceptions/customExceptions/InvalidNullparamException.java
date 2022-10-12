 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidNullparamException extends BaseException {

    public InvalidNullparamException() {
    }

    public InvalidNullparamException(Throwable ex) {
        super(ex);
    }

    public InvalidNullparamException(String message) {
        super(message);
    }

    public InvalidNullparamException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_NULLPARAM;
    }
}
