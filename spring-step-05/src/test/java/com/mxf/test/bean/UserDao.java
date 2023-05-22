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
        hashMap.put("10001", "小傅哥");
        hashMap.put("10002", "八杯水");
        hashMap.put("10003", "阿毛");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}

