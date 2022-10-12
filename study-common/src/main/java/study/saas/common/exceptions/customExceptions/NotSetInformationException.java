package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class NotSetInformationException extends BaseException {
    public NotSetInformationException() {
    }

    public NotSetInformationException(Throwable ex) {
        super(ex);
    }

    public NotSetInformationException(String message) {
        super(message);
    }

    public NotSetInformationException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOT_SET_INFORMATION;
    }
}
