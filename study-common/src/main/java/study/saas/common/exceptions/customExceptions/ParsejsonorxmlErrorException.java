 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ParsejsonorxmlErrorException extends BaseException {

    public ParsejsonorxmlErrorException() {
    }

    public ParsejsonorxmlErrorException(Throwable ex) {
        super(ex);
    }

    public ParsejsonorxmlErrorException(String message) {
        super(message);
    }

    public ParsejsonorxmlErrorException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.PARSEJSONORXML_ERROR;
    }
}
