 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class VoucherMissException extends BaseException {

    public VoucherMissException() {
    }

    public VoucherMissException(Throwable ex) {
        super(ex);
    }

    public VoucherMissException(String message) {
        super(message);
    }

    public VoucherMissException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.VOUCHER_MISS_LEASTCOSTORREDUCECOST;
    }
}
