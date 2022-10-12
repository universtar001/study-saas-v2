package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class CategoryErrorException extends BaseException {
    public CategoryErrorException() {
    }

    public CategoryErrorException(Throwable ex) {
        super(ex);
    }

    public CategoryErrorException(String message) {
        super(message);
    }

    public CategoryErrorException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.CATEGORY_ERROR;
    }
}
