package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class HaveEmptyItemsException extends BaseException {
    public HaveEmptyItemsException() {
    }

    public HaveEmptyItemsException(Throwable ex) {
        super(ex);
    }

    public HaveEmptyItemsException(String message) {
        super(message);
    }

    public HaveEmptyItemsException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.HAVE_EMPTY_ITEMS;
    }
}
