 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class OccupiedLinkException extends BaseException {

    public OccupiedLinkException() {
    }

    public OccupiedLinkException(Throwable ex) {
        super(ex);
    }

    public OccupiedLinkException(String message) {
        super(message);
    }

    public OccupiedLinkException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.OCCUPIED_LINK;
    }
}
