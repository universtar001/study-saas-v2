 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;
public  class InvalidCustomConfigurationException extends BaseException{

    public InvalidCustomConfigurationException() {
    }

    public InvalidCustomConfigurationException(Throwable ex) {
        super(ex);
    }

    public InvalidCustomConfigurationException(String message) {
        super(message);
    }

    public InvalidCustomConfigurationException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.INVALID_CUSTOM_CONFIGURATION;
    }
}
