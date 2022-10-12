package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class NotExistSubmittedCodeException extends BaseException {
    public NotExistSubmittedCodeException() {
    }

    public NotExistSubmittedCodeException(Throwable ex) {
        super(ex);
    }

    public NotExistSubmittedCodeException(String message) {
        super(message);
    }

    public NotExistSubmittedCodeException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOT_EXIST_SUBMITTED_CODE;
    }
}
