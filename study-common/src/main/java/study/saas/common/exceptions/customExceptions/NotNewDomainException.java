package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class NotNewDomainException extends BaseException {

    public NotNewDomainException() {
    }

    public NotNewDomainException(Throwable ex) {
        super(ex);
    }

    public NotNewDomainException(String message) {
        super(message);
    }

    public NotNewDomainException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NO_NEW_DOMAIN;
    }
}
