package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class ExceedLimitDomainException extends BaseException {

    public ExceedLimitDomainException() {
    }

    public ExceedLimitDomainException(Throwable ex) {
        super(ex);
    }

    public ExceedLimitDomainException(String message) {
        super(message);
    }

    public ExceedLimitDomainException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.EXCEEDLIMIT_DOAMIN;
    }
}
