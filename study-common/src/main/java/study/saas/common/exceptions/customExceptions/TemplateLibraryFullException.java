 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class TemplateLibraryFullException extends BaseException {

    public TemplateLibraryFullException() {
    }

    public TemplateLibraryFullException(Throwable ex) {
        super(ex);
    }

    public TemplateLibraryFullException(String message) {
        super(message);
    }

    public TemplateLibraryFullException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.TEMPLATE_LIBRARY_FULL;
    }
}
