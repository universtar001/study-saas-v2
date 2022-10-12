 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class WxpUnpublishedException extends BaseException {

    public WxpUnpublishedException() {
    }

    public WxpUnpublishedException(Throwable ex) {
        super(ex);
    }

    public WxpUnpublishedException(String message) {
        super(message);
    }

    public WxpUnpublishedException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.WXP_UNPUBLISHED;
    }
}
