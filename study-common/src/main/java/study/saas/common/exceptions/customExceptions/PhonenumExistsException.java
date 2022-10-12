 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class PhonenumExistsException extends BaseException {

    public PhonenumExistsException() {
    }

    public PhonenumExistsException(Throwable ex) {
        super(ex);
    }

    public PhonenumExistsException(String message) {
        super(message);
    }

    public PhonenumExistsException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.PHONENUM_EXISTS;
    }
}
