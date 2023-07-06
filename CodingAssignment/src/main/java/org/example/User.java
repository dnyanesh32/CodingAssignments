package org.example;

import lombok.Data;

@Data
public class User {
    public User(String name) {
        this.name = name;
    }
    private String name;
}
