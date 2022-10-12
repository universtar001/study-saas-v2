 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class PagesFieldEmptyException extends BaseException {

    public PagesFieldEmptyException() {
    }

    public PagesFieldEmptyException(Throwable ex) {
        super(ex);
    }

    public PagesFieldEmptyException(String message) {
        super(message);
    }

    public PagesFieldEmptyException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.PAGES_FIELD_EMPTY;
    }
}
