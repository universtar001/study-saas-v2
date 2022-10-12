 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class NotChildLinkException extends BaseException {

    public NotChildLinkException() {
    }

    public NotChildLinkException(Throwable ex) {
        super(ex);
    }

    public NotChildLinkException(String message) {
        super(message);
    }

    public NotChildLinkException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOT_CHILD_LINK;
    }
}
