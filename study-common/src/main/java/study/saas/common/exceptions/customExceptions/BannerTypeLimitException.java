 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class BannerTypeLimitException extends BaseException {

    public BannerTypeLimitException() {
    }

    public BannerTypeLimitException(Throwable ex) {
        super(ex);
    }

    public BannerTypeLimitException(String message) {
        super(message);
    }

    public BannerTypeLimitException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.BANNERTYPE_LIMIT;
    }
}
