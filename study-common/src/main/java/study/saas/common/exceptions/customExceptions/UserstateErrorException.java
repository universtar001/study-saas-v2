 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class UserstateErrorException extends BaseException {

    public UserstateErrorException() {
    }

    public UserstateErrorException(Throwable ex) {
        super(ex);
    }

    public UserstateErrorException(String message) {
        super(message);
    }

    public UserstateErrorException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.USERSTATE_ERROR;
    }
}
