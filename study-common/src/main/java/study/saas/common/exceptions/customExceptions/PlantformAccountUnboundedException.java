package study.saas.common.exceptions.customExceptions;

import study.saas.common.exceptions.BaseException;
import study.saas.common.exceptions.HttpCode;

public class PlantformAccountUnboundedException extends BaseException {
    public PlantformAccountUnboundedException() {
    }

    public PlantformAccountUnboundedException(Throwable ex) {
        super(ex);
    }

    public PlantformAccountUnboundedException(String message) {
        super(message);
    }

    public PlantformAccountUnboundedException(String message, Throwable ex) {
        super(message, ex);
    }

    @Override
    public HttpCode getHttpCode() {
        return HttpCode.PLANTFORMACCOUNT_UNBOUNDED;
    }
}
