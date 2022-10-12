 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidWechatException extends BaseException {

    public InvalidWechatException() {
    }

    public InvalidWechatException(Throwable ex) {
        super(ex);
    }

    public InvalidWechatException(String message) {
        super(message);
    }

    public InvalidWechatException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_WECHAT;
    }
}
