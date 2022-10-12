 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class UpperlimitTrailwechatException extends BaseException {

    public UpperlimitTrailwechatException() {
    }

    public UpperlimitTrailwechatException(Throwable ex) {
        super(ex);
    }

    public UpperlimitTrailwechatException(String message) {
        super(message);
    }

    public UpperlimitTrailwechatException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.UPPERLIMIT_TRAILWECHAT;
    }
}
