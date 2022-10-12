package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class TitleErrorExeception extends BaseException {
    public TitleErrorExeception() {
    }

    public TitleErrorExeception(Throwable ex) {
        super(ex);
    }

    public TitleErrorExeception(String message) {
        super(message);
    }

    public TitleErrorExeception(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.TITLE_ERROR;
    }
}
