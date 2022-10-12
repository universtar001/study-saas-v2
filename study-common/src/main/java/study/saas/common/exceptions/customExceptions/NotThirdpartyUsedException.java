package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class NotThirdpartyUsedException extends BaseException {
    public NotThirdpartyUsedException() {
    }

    public NotThirdpartyUsedException(Throwable ex) {
        super(ex);
    }

    public NotThirdpartyUsedException(String message) {
        super(message);
    }

    public NotThirdpartyUsedException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOT_THIRDPARTY_USED;
    }
}
