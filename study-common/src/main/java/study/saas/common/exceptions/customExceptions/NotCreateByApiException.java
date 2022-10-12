package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class NotCreateByApiException extends BaseException {
    public NotCreateByApiException() {
    }

    public NotCreateByApiException(Throwable ex) {
        super(ex);
    }

    public NotCreateByApiException(String message) {
        super(message);
    }

    public NotCreateByApiException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOT_CREATE_BY_API;
    }
}
