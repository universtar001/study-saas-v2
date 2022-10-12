 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissProductnameException extends BaseException {

    public MissProductnameException() {
    }

    public MissProductnameException(Throwable ex) {
        super(ex);
    }

    public MissProductnameException(String message) {
        super(message);
    }

    public MissProductnameException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_PRODUCTNAME;
    }
}
