 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MsgContentSizeExceedException extends BaseException {

    public MsgContentSizeExceedException() {
    }

    public MsgContentSizeExceedException(Throwable ex) {
        super(ex);
    }

    public MsgContentSizeExceedException(String message) {
        super(message);
    }

    public MsgContentSizeExceedException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MSGCONTENSIZE_EXCEED;
    }
}
