 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class NeedUserconcernException extends BaseException {

    public NeedUserconcernException() {
    }

    public NeedUserconcernException(Throwable ex) {
        super(ex);
    }

    public NeedUserconcernException(String message) {
        super(message);
    }

    public NeedUserconcernException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NEED_USERCONCERN;
    }
}
