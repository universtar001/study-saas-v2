 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class LinkNoIcpRecordException extends BaseException {

    public LinkNoIcpRecordException() {
    }

    public LinkNoIcpRecordException(Throwable ex) {
        super(ex);
    }

    public LinkNoIcpRecordException(String message) {
        super(message);
    }

    public LinkNoIcpRecordException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.LINK_NO_ICP_RECORD;
    }
}
