 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InternalServerException extends BaseException {

    public InternalServerException() {
    }

    public InternalServerException(Throwable ex) {
        super(ex);
    }

    public InternalServerException(String message) {
        super(message);
    }

    public InternalServerException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INTERNAL_SERVER_ERROR;
    }
}
