 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ProductSoldoutException extends BaseException {

    public ProductSoldoutException() {
    }

    public ProductSoldoutException(Throwable ex) {
        super(ex);
    }

    public ProductSoldoutException(String message) {
        super(message);
    }

    public ProductSoldoutException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.PRODUCT_SOLDOUT;
    }
}
