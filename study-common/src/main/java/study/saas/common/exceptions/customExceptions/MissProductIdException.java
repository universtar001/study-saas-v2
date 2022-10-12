 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissProductIdException extends BaseException {

    public MissProductIdException() {
    }

    public MissProductIdException(Throwable ex) {
        super(ex);
    }

    public MissProductIdException(String message) {
        super(message);
    }

    public MissProductIdException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_PRODUCTID;
    }
}
