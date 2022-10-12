package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class InvalidCategoryInformationException extends BaseException {
    public InvalidCategoryInformationException() {
    }

    public InvalidCategoryInformationException(Throwable ex) {
        super(ex);
    }

    public InvalidCategoryInformationException(String message) {
        super(message);
    }

    public InvalidCategoryInformationException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_CATEGORY_INFORMATION;
    }
}
