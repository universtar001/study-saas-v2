 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class OkException extends BaseException {

    public OkException() {
    }

    public OkException(Throwable ex) {
        super(ex);
    }

    public OkException(String message) {
        super(message);
    }

    public OkException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.OK;
    }
}
