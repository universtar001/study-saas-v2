 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class MissDeptidException extends BaseException {

    public MissDeptidException() {
    }

    public MissDeptidException(Throwable ex) {
        super(ex);
    }

    public MissDeptidException(String message) {
        super(message);
    }

    public MissDeptidException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.MISS_DEPTID;
    }
}
