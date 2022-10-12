package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class ListNumberFilledException extends BaseException {
    public ListNumberFilledException() {
    }

    public ListNumberFilledException(Throwable ex) {
        super(ex);
    }

    public ListNumberFilledException(String message) {
        super(message);
    }

    public ListNumberFilledException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.LIST_NUMBER_FILLED;
    }
}
