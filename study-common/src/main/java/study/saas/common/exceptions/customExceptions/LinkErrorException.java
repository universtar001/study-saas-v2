 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class LinkErrorException extends BaseException {

    public LinkErrorException() {
    }

    public LinkErrorException(Throwable ex) {
        super(ex);
    }

    public LinkErrorException(String message) {
        super(message);
    }

    public LinkErrorException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.LINK_ERROR;
    }
}
