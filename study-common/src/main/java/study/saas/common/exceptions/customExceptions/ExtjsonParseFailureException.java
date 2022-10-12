 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class ExtjsonParseFailureException extends BaseException {

    public ExtjsonParseFailureException() {
    }

    public ExtjsonParseFailureException(Throwable ex) {
        super(ex);
    }

    public ExtjsonParseFailureException(String message) {
        super(message);
    }

    public ExtjsonParseFailureException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.EXTJSON_PARSE_FAILURE;
    }
}
