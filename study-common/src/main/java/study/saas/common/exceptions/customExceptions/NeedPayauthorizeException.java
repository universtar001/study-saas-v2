 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class NeedPayauthorizeException extends BaseException {

    public NeedPayauthorizeException() {
    }

    public NeedPayauthorizeException(Throwable ex) {
        super(ex);
    }

    public NeedPayauthorizeException(String message) {
        super(message);
    }

    public NeedPayauthorizeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NEED_PAYAUTHORIZE;
    }
}
