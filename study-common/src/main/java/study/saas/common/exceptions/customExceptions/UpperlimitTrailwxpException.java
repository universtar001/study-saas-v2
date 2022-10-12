 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class UpperlimitTrailwxpException extends BaseException {

    public UpperlimitTrailwxpException() {
    }

    public UpperlimitTrailwxpException(Throwable ex) {
        super(ex);
    }

    public UpperlimitTrailwxpException(String message) {
        super(message);
    }

    public UpperlimitTrailwxpException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.UPPERLIMIT_TRAILWXP;
    }
}
