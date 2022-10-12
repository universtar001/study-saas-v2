 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MediafilesizeExceedException extends BaseException {

    public MediafilesizeExceedException() {
    }

    public MediafilesizeExceedException(Throwable ex) {
        super(ex);
    }

    public MediafilesizeExceedException(String message) {
        super(message);
    }

    public MediafilesizeExceedException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MEDIAFILESIZE_EXCEED;
    }
}
