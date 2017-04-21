package com.freedom.d_xml.a_constructor;

/**
 * Created by kuiyuxiang on 2017/4/21.
 */
public class User {
    private Integer userid;
    private String username;
    private Integer age;

    public User(Integer userid, String username) {
        this.userid = userid;
        this.username = username;
    }

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
