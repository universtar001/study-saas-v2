 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class UserNotFoundException extends BaseException {

    public UserNotFoundException() {
    }

    public UserNotFoundException(Throwable ex) {
        super(ex);
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.USERNOTFOUND;
    }
}
