package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class PlantformAccountBoundedException extends BaseException {
    public PlantformAccountBoundedException() {
    }

    public PlantformAccountBoundedException(Throwable ex) {
        super(ex);
    }

    public PlantformAccountBoundedException(String message) {
        super(message);
    }

    public PlantformAccountBoundedException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.PLANTFORMACCOUNT_BOUNDED;
    }
}
