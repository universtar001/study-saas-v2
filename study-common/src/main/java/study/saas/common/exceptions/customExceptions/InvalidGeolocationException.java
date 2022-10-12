 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidGeolocationException extends BaseException {

    public InvalidGeolocationException() {
    }

    public InvalidGeolocationException(Throwable ex) {
        super(ex);
    }

    public InvalidGeolocationException(String message) {
        super(message);
    }

    public InvalidGeolocationException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_GEOLOCATION;
    }
}
