package com.ytc.app3.form;

public class LoginForm {
    String name;
    String password;
    String checkcode;

    public LoginForm() {
    }

    public LoginForm(String name, String password, String checkcode) {
        this.name = name;
        this.password = password;
        this.checkcode = checkcode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCheckcode() {
        return this.checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    public LoginForm name(String name) {
        setName(name);
        return this;
    }

    public LoginForm password(String password) {
        setPassword(password);
        return this;
    }

    public LoginForm checkcode(String checkcode) {
        setCheckcode(checkcode);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", password='" + getPassword() + "'" +
            ", checkcode='" + getCheckcode() + "'" +
            "}";
    }

}