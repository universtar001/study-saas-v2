 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidAvatarException extends BaseException {

    public InvalidAvatarException() {
    }

    public InvalidAvatarException(Throwable ex) {
        super(ex);
    }

    public InvalidAvatarException(String message) {
        super(message);
    }

    public InvalidAvatarException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_AVATAR;
    }
}
