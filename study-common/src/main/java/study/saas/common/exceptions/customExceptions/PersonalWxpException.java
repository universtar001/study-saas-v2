 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class PersonalWxpException extends BaseException {

    public PersonalWxpException() {
    }

    public PersonalWxpException(Throwable ex) {
        super(ex);
    }

    public PersonalWxpException(String message) {
        super(message);
    }

    public PersonalWxpException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.PERSONAL_WXP;
    }
}
