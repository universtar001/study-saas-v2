 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class UserBanException extends BaseException {

    public UserBanException() {
    }

    public UserBanException(Throwable ex) {
        super(ex);
    }

    public UserBanException(String message) {
        super(message);
    }

    public UserBanException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.USER_BAN;
    }
}
