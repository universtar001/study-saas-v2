package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class NotWxpAccountException extends BaseException {

    public NotWxpAccountException() {
    }

    public NotWxpAccountException(Throwable ex) {
        super(ex);
    }

    public NotWxpAccountException(String message) {
        super(message);
    }

    public NotWxpAccountException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOT_WXP_ACCOUNT;
    }
}
