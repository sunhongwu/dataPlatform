package com.service.platform.handler;

/**
 *  统一运行异常类
 *  @author: linyang
 *  @since: 2017/8/21 0021 下午 10:49 
 **/
public class UnifiedException extends RuntimeException {

    private String code;

    /**
     * 初始化 统一运行异常类
     * @param code      错误码
     */
    public UnifiedException(String code, String message ) {
        super( message );
        this.code = code;
    }
    /**
     * 初始化 统一运行异常类
     * @param message   错误信息
     * @param cause     错误堆栈
     * @param code      错误码
     */
    public UnifiedException(String code, String message, Throwable cause ) {
        super( message, cause );
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
