package org.igetwell.common.exhandler.controller;

import org.igetwell.common.exhandler.exception.TokenExpiredException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.igetwell.common.constans.HttpStatus;
import org.igetwell.common.exhandler.exception.BaseException;
import org.igetwell.common.util.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 业务异常处理
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    /*@ExceptionHandler(value = BaseException.class)
    public Object baseErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        logger.error("---BaseException Handler---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());
        return e.getMessage();
    }*/

    @ExceptionHandler
    public ResponseEntity defaultErrorHandler(HttpServletRequest req, Exception e) {
        logger.error("---DefaultException Handler---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());

        if (e instanceof IllegalArgumentException || e instanceof MethodArgumentTypeMismatchException){
            //400 非法请求参数
            return new ResponseEntity<String>(HttpStatus.FORBIDDEN, e.getMessage());
        }
        if (e instanceof AccessDeniedException){
            //401
            return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED, e.getMessage());
        }
        if (e instanceof NoHandlerFoundException){
            //404
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND, e.getMessage());
        }
        if (e instanceof TokenExpiredException){
            return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED, "Token has expired");
        }
        if (e instanceof BaseException){
            //服务器异常
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }

        if (logger.isErrorEnabled()){
            logger.error("系统异常! {}", e.getMessage());
        }
        return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
    }
}
