package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class NotSetDomainOnThirdException extends BaseException {

    public NotSetDomainOnThirdException() {
    }

    public NotSetDomainOnThirdException(Throwable ex) {
        super(ex);
    }

    public NotSetDomainOnThirdException(String message) {
        super(message);
    }

    public NotSetDomainOnThirdException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NOTSETDOMAIN_ONTHIRD;
    }
}
