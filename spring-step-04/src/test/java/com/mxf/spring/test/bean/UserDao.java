package com.mxf.spring.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author manxingfu
 * @date 2023/4/25
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "ChatGPT");
        hashMap.put("10002", "OpenAI");
        hashMap.put("10003", "Java");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
