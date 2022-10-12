package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class PagePathErrorException extends BaseException {
    public PagePathErrorException() {
    }

    public PagePathErrorException(Throwable ex) {
        super(ex);
    }

    public PagePathErrorException(String message) {
        super(message);
    }

    public PagePathErrorException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.PAGE_PATH_ERROR;
    }
}
