 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class LoginFailException extends BaseException {

    public LoginFailException() {
    }

    public LoginFailException(Throwable ex) {
        super(ex);
    }

    public LoginFailException(String message) {
        super(message);
    }

    public LoginFailException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.LOGIN_FAIL;
    }
}
