package com.mxf.spring;

/**
 * @author manxingfu
 * @date 2023/4/21
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
