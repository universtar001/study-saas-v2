 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissingPathTabbarException extends BaseException {

    public MissingPathTabbarException() {
    }

    public MissingPathTabbarException(Throwable ex) {
        super(ex);
    }

    public MissingPathTabbarException(String message) {
        super(message);
    }

    public MissingPathTabbarException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISSING_PATH_TABBAR;
    }
}
