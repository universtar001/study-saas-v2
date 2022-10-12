 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MaximumWithdrawException extends BaseException {

    public MaximumWithdrawException() {
    }

    public MaximumWithdrawException(Throwable ex) {
        super(ex);
    }

    public MaximumWithdrawException(String message) {
        super(message);
    }

    public MaximumWithdrawException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MAXIMUM_WITHDRAW;
    }
}
