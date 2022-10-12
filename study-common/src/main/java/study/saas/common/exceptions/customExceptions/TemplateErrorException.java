 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class TemplateErrorException extends BaseException {

    public TemplateErrorException() {
    }

    public TemplateErrorException(Throwable ex) {
        super(ex);
    }

    public TemplateErrorException(String message) {
        super(message);
    }

    public TemplateErrorException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.TEMPLATE_ERROR;
    }
}
