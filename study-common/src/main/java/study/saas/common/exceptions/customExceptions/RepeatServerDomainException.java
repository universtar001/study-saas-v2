package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class RepeatServerDomainException extends BaseException {

    public RepeatServerDomainException() {
    }

    public RepeatServerDomainException(Throwable ex) {
        super(ex);
    }

    public RepeatServerDomainException(String message) {
        super(message);
    }

    public RepeatServerDomainException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.REPEAT_SERVER_DOMAIN;
    }
}
