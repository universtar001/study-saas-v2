 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class WxproxyNotFoundException extends BaseException {

    public WxproxyNotFoundException() {
    }

    public WxproxyNotFoundException(Throwable ex) {
        super(ex);
    }

    public WxproxyNotFoundException(String message) {
        super(message);
    }

    public WxproxyNotFoundException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.WXPROXYNOTFOUND;
    }
}
