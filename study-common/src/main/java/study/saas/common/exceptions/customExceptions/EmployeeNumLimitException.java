 package study.saas.common.exceptions.customExceptions;

 import study.saas.common.exceptions.BaseException;
 import study.saas.common.exceptions.HttpCode;

 public  class EmployeeNumLimitException extends BaseException {

    public EmployeeNumLimitException() {
    }

    public EmployeeNumLimitException(Throwable ex) {
        super(ex);
    }

    public EmployeeNumLimitException(String message) {
        super(message);
    }

    public EmployeeNumLimitException(String message, Throwable ex) {
        super(message, ex);
    }


    @Override
    public HttpCode getHttpCode() {
        return HttpCode.EMPLOYEENUM_LIMIT;
    }
}
