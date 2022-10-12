 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class NotexistWechatException extends BaseException {

    public NotexistWechatException() {
    }

    public NotexistWechatException(Throwable ex) {
        super(ex);
    }

    public NotexistWechatException(String message) {
        super(message);
    }

    public NotexistWechatException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOTEXIST_WECHAT;
    }
}
