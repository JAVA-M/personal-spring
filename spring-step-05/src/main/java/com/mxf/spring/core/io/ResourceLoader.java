package com.mxf.spring.core.io;

/**
 * @author manxingfu
 * @date 2023/4/27 15:59
 * @desc 定义获取资源接口，里面传递 location 地址即可。
 */
public interface ResourceLoader {
    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
