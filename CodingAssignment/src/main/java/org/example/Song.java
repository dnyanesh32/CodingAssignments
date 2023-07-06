package org.example;

import lombok.Data;

@Data
public class Song {
    public Song(String name) {
        this.name = name;
    }
    private String name;
}
