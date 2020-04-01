package com.company;

public class User {private String name;
    private String lastName;
    private String email;
    private String password;

    User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    User(String email) {
        this.name = "guest";
        this.lastName = "guest";
        this.email = email;
        this.password = "guest";
    }

    User(User user, String name, String lastName, String password) {
        this.email = user.email;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
    }
}
