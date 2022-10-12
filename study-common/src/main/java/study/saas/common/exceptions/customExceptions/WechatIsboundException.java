 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class WechatIsboundException extends BaseException {

    public WechatIsboundException() {
    }

    public WechatIsboundException(Throwable ex) {
        super(ex);
    }

    public WechatIsboundException(String message) {
        super(message);
    }

    public WechatIsboundException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.WECHAT_ISBOUND;
    }
}
