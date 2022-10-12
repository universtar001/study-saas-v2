 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class BadRequestException extends BaseException {

    public BadRequestException() {
    }

    public BadRequestException(Throwable ex) {
        super(ex);
    }

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.BAD_REQUEST;
    }
}
