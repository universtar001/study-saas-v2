package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class HaveReviewingVersionException extends BaseException {
    public HaveReviewingVersionException() {
    }

    public HaveReviewingVersionException(Throwable ex) {
        super(ex);
    }

    public HaveReviewingVersionException(String message) {
        super(message);
    }

    public HaveReviewingVersionException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.HAVE_REVIEWING_VERSION;
    }
}
