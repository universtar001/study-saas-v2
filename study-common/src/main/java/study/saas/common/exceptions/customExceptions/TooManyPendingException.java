package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class TooManyPendingException extends BaseException {
    public TooManyPendingException() {
    }

    public TooManyPendingException(Throwable ex) {
        super(ex);
    }

    public TooManyPendingException(String message) {
        super(message);
    }

    public TooManyPendingException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.TOO_MANY_PENDING;
    }
}
