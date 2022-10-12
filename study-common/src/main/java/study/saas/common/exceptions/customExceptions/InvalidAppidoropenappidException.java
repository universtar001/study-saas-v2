package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class InvalidAppidoropenappidException extends BaseException {
    public InvalidAppidoropenappidException() {
    }

    public InvalidAppidoropenappidException(Throwable ex) {
        super(ex);
    }

    public InvalidAppidoropenappidException(String message) {
        super(message);
    }

    public InvalidAppidoropenappidException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_APPIDOROPENAPPID;
    }
}
