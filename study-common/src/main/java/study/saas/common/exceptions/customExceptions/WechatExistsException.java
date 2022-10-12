 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class WechatExistsException extends BaseException {

    public WechatExistsException() {
    }

    public WechatExistsException(Throwable ex) {
        super(ex);
    }

    public WechatExistsException(String message) {
        super(message);
    }

    public WechatExistsException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.WECHAT_EXISTS;
    }
}
