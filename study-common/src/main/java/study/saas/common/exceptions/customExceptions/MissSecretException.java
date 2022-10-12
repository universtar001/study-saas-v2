 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissSecretException extends BaseException {

    public MissSecretException() {
    }

    public MissSecretException(Throwable ex) {
        super(ex);
    }

    public MissSecretException(String message) {
        super(message);
    }

    public MissSecretException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_SECRET;
    }
}
