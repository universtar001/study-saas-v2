package study.saas.common.exceptions;

import study.saas.common.enumutil.ExceptionEnum;
import study.saas.common.exceptions.customExceptions.ExpiredProductTimeException;
import study.saas.common.viewmodel.ApiError;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.session.InvalidSessionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 错误异常定义
 */

@ControllerAdvice
public class ExceptionHandle {
    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);
    /**
     * 判断错误是否是已定义的已知错误，不是则由未知错误代替，同时记录在log中
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiError exceptionGet(Exception e) {
        if (e instanceof DescribeException) {
            DescribeException MyException = (DescribeException) e;
            return new ApiError(MyException.getCode(),MyException.getMessage());
        }
        //后台在shiro中没有找到session的时候抛出异常InvalidSessionException
        if (e instanceof UnauthenticatedException || e instanceof InvalidSessionException){
            DescribeException MyException = new DescribeException(ExceptionEnum.UNAUTHENTICATED);
            return new ApiError(MyException.getCode(),MyException.getMessage());
        }
        //没有权限的时候
        if (e instanceof UnauthorizedException){
            DescribeException MyException = new DescribeException(ExceptionEnum.FORBIDDEN);
            return new ApiError(MyException.getCode(),MyException.getMessage());
        }
        if (e instanceof ExpiredProductTimeException){
            DescribeException MyException = new DescribeException(ExceptionEnum.EXPIRED_PRODUCTTIME);
            return new ApiError(MyException.getCode(),MyException.getMessage());
        }
        //登录账号密码错误时
        if (e instanceof AuthenticationException){
            DescribeException MyException = new DescribeException(ExceptionEnum.UNKNOWNACCOUNT);
            return new ApiError(MyException.getCode(),MyException.getMessage());
        }
        LOGGER.error("【系统异常】{}",e);
        DescribeException systemException = new DescribeException(ExceptionEnum.INTERNAL_SERVER_ERROR);
        return new ApiError(systemException.getCode(),systemException.getMessage());
    }
}