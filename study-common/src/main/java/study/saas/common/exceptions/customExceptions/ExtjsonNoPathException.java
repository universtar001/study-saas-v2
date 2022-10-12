 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ExtjsonNoPathException extends BaseException {

    public ExtjsonNoPathException() {
    }

    public ExtjsonNoPathException(Throwable ex) {
        super(ex);
    }

    public ExtjsonNoPathException(String message) {
        super(message);
    }

    public ExtjsonNoPathException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.EXTJSON_NO_PATH;
    }
}
