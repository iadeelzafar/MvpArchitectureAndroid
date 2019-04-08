package com.example.mvparchitectureandroid.view;

/**
 * Created by bpn on 11/30/17.
 */

public class Client {

    private String fullName = "", email = "";

    public Client() {
    }

    public Client (String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email : " + email + "\nFullName : " + fullName;
    }
}
