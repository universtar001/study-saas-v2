package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class NotBelongServerDomainException extends BaseException {

    public NotBelongServerDomainException() {
    }

    public NotBelongServerDomainException(Throwable ex) {
        super(ex);
    }

    public NotBelongServerDomainException(String message) {
        super(message);
    }

    public NotBelongServerDomainException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOT_BELONG_SERVER_DOMAIN;
    }
}
