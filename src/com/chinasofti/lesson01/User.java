package com.chinasofti.lesson01;

import com.chinasofti.util.Property;
import com.chinasofti.util.Table;

/**
 *  java中实体类是User
 *      id
 *      username
 *      password
 *  在数据库中实体类是t_user
 *      t_id    类型   长度
 *      t_username
 *      t_password
 */


@Table(name="t_user")
public class User {

    @Property(name="t_id",len=11)
    private int id;
    @Property(name="t_username",len=50)
    private String username;
    @Property(name="t_password",len=50)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
