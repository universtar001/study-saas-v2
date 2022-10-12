package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class ExceedLimitServerDoaminException extends BaseException {

    public ExceedLimitServerDoaminException() {
    }

    public ExceedLimitServerDoaminException(Throwable ex) {
        super(ex);
    }

    public ExceedLimitServerDoaminException(String message) {
        super(message);
    }

    public ExceedLimitServerDoaminException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.EXCEEDLIMIT_SERVER_DOAMIN;
    }
}
