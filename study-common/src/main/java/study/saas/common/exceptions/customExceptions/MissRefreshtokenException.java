 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissRefreshtokenException extends BaseException {

    public MissRefreshtokenException() {
    }

    public MissRefreshtokenException(Throwable ex) {
        super(ex);
    }

    public MissRefreshtokenException(String message) {
        super(message);
    }

    public MissRefreshtokenException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_REFRESHTOKEN;
    }
}
