package com.kh.testEx.test1pre;

public class Member {
    private String id;
    private String name;
    private String password;

    public Member() {
    }

    public Member(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "login{" +"id='" + id +", name='" + name +", password='" + password +'}';
    }

    public boolean login(String name, String password) {
        return true;
    }
}
