 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class BlacklistedLinkException extends BaseException {

    public BlacklistedLinkException() {
    }

    public BlacklistedLinkException(Throwable ex) {
        super(ex);
    }

    public BlacklistedLinkException(String message) {
        super(message);
    }

    public BlacklistedLinkException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.BLACKLISTED_LINK;
    }
}
