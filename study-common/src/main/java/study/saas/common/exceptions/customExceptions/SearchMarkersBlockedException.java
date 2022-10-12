 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class SearchMarkersBlockedException extends BaseException {

    public SearchMarkersBlockedException() {
    }

    public SearchMarkersBlockedException(Throwable ex) {
        super(ex);
    }

    public SearchMarkersBlockedException(String message) {
        super(message);
    }

    public SearchMarkersBlockedException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.SEARCH_MARKERS_BLOCKED;
    }
}
