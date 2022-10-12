 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class UnapprovedWxpException extends BaseException {

    public UnapprovedWxpException() {
    }

    public UnapprovedWxpException(Throwable ex) {
        super(ex);
    }

    public UnapprovedWxpException(String message) {
        super(message);
    }

    public UnapprovedWxpException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.UNAPPROVED_WXP;
    }
}
