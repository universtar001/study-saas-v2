 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class FullQrCodeException extends BaseException {

    public FullQrCodeException() {
    }

    public FullQrCodeException(Throwable ex) {
        super(ex);
    }

    public FullQrCodeException(String message) {
        super(message);
    }

    public FullQrCodeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.FULL_QR_CODE;
    }
}
