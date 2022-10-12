 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidPreauthcodeException extends BaseException {

    public InvalidPreauthcodeException() {
    }

    public InvalidPreauthcodeException(Throwable ex) {
        super(ex);
    }

    public InvalidPreauthcodeException(String message) {
        super(message);
    }

    public InvalidPreauthcodeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_PREAUTHCODE;
    }
}
