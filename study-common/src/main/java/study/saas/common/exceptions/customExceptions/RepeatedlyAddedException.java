 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class RepeatedlyAddedException extends BaseException {

    public RepeatedlyAddedException() {
    }

    public RepeatedlyAddedException(Throwable ex) {
        super(ex);
    }

    public RepeatedlyAddedException(String message) {
        super(message);
    }

    public RepeatedlyAddedException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.REPEATEDLY_ADDED;
    }
}
