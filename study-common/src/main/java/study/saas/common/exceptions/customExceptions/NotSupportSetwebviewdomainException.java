package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class NotSupportSetwebviewdomainException extends BaseException {

    public NotSupportSetwebviewdomainException() {
    }

    public NotSupportSetwebviewdomainException(Throwable ex) {
        super(ex);
    }

    public NotSupportSetwebviewdomainException(String message) {
        super(message);
    }

    public NotSupportSetwebviewdomainException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOT_SUPPORT_SETWEBVIEWDOMAIN;
    }
}
