 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class CannotFindTemplateException extends BaseException {

    public CannotFindTemplateException() {
    }

    public CannotFindTemplateException(Throwable ex) {
        super(ex);
    }

    public CannotFindTemplateException(String message) {
        super(message);
    }

    public CannotFindTemplateException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.CANNOT_FIND_TEMPLATE;
    }
}
