 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class InvalidFilesizeException extends BaseException {

    public InvalidFilesizeException() {
    }

    public InvalidFilesizeException(Throwable ex) {
        super(ex);
    }

    public InvalidFilesizeException(String message) {
        super(message);
    }

    public InvalidFilesizeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_FILESIZE;
    }
}
