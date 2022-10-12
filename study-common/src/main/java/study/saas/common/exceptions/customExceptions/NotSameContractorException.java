package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class NotSameContractorException extends BaseException {
    public NotSameContractorException() {
    }

    public NotSameContractorException(Throwable ex) {
        super(ex);
    }

    public NotSameContractorException(String message) {
        super(message);
    }

    public NotSameContractorException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOT_SAME_CONTRACTOR;
    }
}
