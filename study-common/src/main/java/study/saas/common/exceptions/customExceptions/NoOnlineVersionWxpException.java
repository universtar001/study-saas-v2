 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class NoOnlineVersionWxpException extends BaseException {

    public NoOnlineVersionWxpException() {
    }

    public NoOnlineVersionWxpException(Throwable ex) {
        super(ex);
    }

    public NoOnlineVersionWxpException(String message) {
        super(message);
    }

    public NoOnlineVersionWxpException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NO_ONLINE_VERSION_WXP;
    }
}
