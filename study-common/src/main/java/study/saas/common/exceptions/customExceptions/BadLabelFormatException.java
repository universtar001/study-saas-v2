package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class BadLabelFormatException extends BaseException {
    public BadLabelFormatException() {
    }

    public BadLabelFormatException(Throwable ex) {
        super(ex);
    }

    public BadLabelFormatException(String message) {
        super(message);
    }

    public BadLabelFormatException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.BAD_LABEL_FORMAT;
    }
}
