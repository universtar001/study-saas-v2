package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

public  class AccountNumLimitException extends BaseException {

    public AccountNumLimitException() {
    }

    public AccountNumLimitException(Throwable ex) {
        super(ex);
    }

    public AccountNumLimitException(String message) {
        super(message);
    }

    public AccountNumLimitException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.ACCOUNTNUM_LIMIT;
    }
}
