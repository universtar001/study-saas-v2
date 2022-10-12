 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissNoticeException extends BaseException {

    public MissNoticeException() {
    }

    public MissNoticeException(Throwable ex) {
        super(ex);
    }

    public MissNoticeException(String message) {
        super(message);
    }

    public MissNoticeException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_NOTICE;
    }
}
