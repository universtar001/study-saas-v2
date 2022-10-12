 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissTitleException extends BaseException {

    public MissTitleException() {
    }

    public MissTitleException(Throwable ex) {
        super(ex);
    }

    public MissTitleException(String message) {
        super(message);
    }

    public MissTitleException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_TITLE;
    }
}
