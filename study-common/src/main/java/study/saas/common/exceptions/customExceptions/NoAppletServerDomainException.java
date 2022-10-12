package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class NoAppletServerDomainException extends BaseException {

    public NoAppletServerDomainException() {
    }

    public NoAppletServerDomainException(Throwable ex) {
        super(ex);
    }

    public NoAppletServerDomainException(String message) {
        super(message);
    }

    public NoAppletServerDomainException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.NO_APPLET_SERVER_DOMAIN;
    }
}
