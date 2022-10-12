 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidTemplateNumberException extends BaseException {

    public InvalidTemplateNumberException() {
    }

    public InvalidTemplateNumberException(Throwable ex) {
        super(ex);
    }

    public InvalidTemplateNumberException(String message) {
        super(message);
    }

    public InvalidTemplateNumberException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_TEMPLATE_NUMBER;
    }
}
