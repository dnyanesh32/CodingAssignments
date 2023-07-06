package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RecentlyPlayed store = new RecentlyPlayed(3);

        User user = new User("D.MISAL");

        Song song1 = new Song("S1");
        Song song2 = new Song("S2");
        Song song3 = new Song("S3");
        Song song4 = new Song("S4");

        store.addSong(user, song1);
        store.addSong(user, song2);
        store.addSong(user, song3);

        System.out.println("recently played songs for " + user.getName() + ":");
        List<Song> recentlyPlayedSongs = store.getRecentlyPlayedSongs(user);
        for (Song song : recentlyPlayedSongs) {
            System.out.println(song.getName());
        }

        store.addSong(user, song4);

        System.out.println("recently played songs for " + user.getName() + ":");
        recentlyPlayedSongs = store.getRecentlyPlayedSongs(user);
        for (Song song : recentlyPlayedSongs) {
            System.out.println(song.getName());
        }
        }
    }
