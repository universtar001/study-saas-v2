 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ContainSensitiveWordException extends BaseException {

    public ContainSensitiveWordException() {
    }

    public ContainSensitiveWordException(Throwable ex) {
        super(ex);
    }

    public ContainSensitiveWordException(String message) {
        super(message);
    }

    public ContainSensitiveWordException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.CONTAIN_SENSITIVEWORD;
    }
}
