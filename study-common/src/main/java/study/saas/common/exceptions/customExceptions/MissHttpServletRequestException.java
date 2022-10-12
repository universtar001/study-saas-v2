 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissHttpServletRequestException extends BaseException {

    public MissHttpServletRequestException() {
    }

    public MissHttpServletRequestException(Throwable ex) {
        super(ex);
    }

    public MissHttpServletRequestException(String message) {
        super(message);
    }

    public MissHttpServletRequestException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_HTTPSERVLETREQUEST;
    }
}
