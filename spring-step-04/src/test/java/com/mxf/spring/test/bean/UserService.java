package com.mxf.spring.test.bean;

/**
 * @author manxingfu
 * @date 2023/4/21
 */
public class UserService {
    private String name;

    private Integer age;

    public UserService(String name) {
        this.name = name;
    }

    public UserService(Integer age) {
        this.age = age;
    }

    public UserService(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        if (name != null) {
            sb.append("name: ").append(name);
        }
        if (age != null) {
            sb.append(" age: ").append(age);
        }
        return sb.toString();
    }
}
