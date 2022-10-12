 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MultiStatusException extends BaseException {

    public MultiStatusException() {
    }

    public MultiStatusException(Throwable ex) {
        super(ex);
    }

    public MultiStatusException(String message) {
        super(message);
    }

    public MultiStatusException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MULTI_STATUS;
    }
}
