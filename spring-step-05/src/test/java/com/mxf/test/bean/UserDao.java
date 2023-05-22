package com.mxf.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author manxingfu
 * @date 2023/5/22 14:51
 * @desc
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "Java程序员");
        hashMap.put("10002", "C#程序员");
        hashMap.put("10003", "Vue前端程序员");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}

