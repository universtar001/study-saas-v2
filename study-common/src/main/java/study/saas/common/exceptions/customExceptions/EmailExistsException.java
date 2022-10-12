 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class EmailExistsException extends BaseException {

    public EmailExistsException() {
    }

    public EmailExistsException(Throwable ex) {
        super(ex);
    }

    public EmailExistsException(String message) {
        super(message);
    }

    public EmailExistsException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.EMAIL_EXISTS;
    }
}
