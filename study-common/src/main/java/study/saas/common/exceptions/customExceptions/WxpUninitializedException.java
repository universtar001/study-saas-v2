 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class WxpUninitializedException extends BaseException {

    public WxpUninitializedException() {
    }

    public WxpUninitializedException(Throwable ex) {
        super(ex);
    }

    public WxpUninitializedException(String message) {
        super(message);
    }

    public WxpUninitializedException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.WXP_UNINITIALIZED;
    }
}
