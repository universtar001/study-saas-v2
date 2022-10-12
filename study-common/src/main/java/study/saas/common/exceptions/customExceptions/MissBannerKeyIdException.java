 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissBannerKeyIdException extends BaseException {

    public MissBannerKeyIdException() {
    }

    public MissBannerKeyIdException(Throwable ex) {
        super(ex);
    }

    public MissBannerKeyIdException(String message) {
        super(message);
    }

    public MissBannerKeyIdException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_BANNERKEYID;
    }
}
