 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class NotFoundException extends BaseException {

    public NotFoundException() {
    }

    public NotFoundException(Throwable ex) {
        super(ex);
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOT_FOUND;
    }
}
