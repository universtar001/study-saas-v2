package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class MaxNumberReachedException extends BaseException {
    public MaxNumberReachedException() {
    }

    public MaxNumberReachedException(Throwable ex) {
        super(ex);
    }

    public MaxNumberReachedException(String message) {
        super(message);
    }

    public MaxNumberReachedException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MAX_NUMBER_REACHED;
    }
}
