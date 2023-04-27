package com.mxf.spring.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author manxingfu
 * @date 2023/4/27 15:34
 * @desc 处理资源加载流
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
