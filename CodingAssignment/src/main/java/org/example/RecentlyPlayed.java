package org.example;

import java.util.List;
import java.util.*;

public class RecentlyPlayed {
    private int capacity;
    private Map<User, LinkedList<Song>> store;

    public RecentlyPlayed(int capacity) {
        this.capacity = capacity;
        this.store = new HashMap<>();
    }

    public void addSong(User user, Song song) {
        if (!store.containsKey(user)) {
            store.put(user, new LinkedList<>());
        }

        LinkedList<Song> songs = store.get(user);


        if (songs.size() >= capacity) {
            songs.removeFirst();
        }

        songs.add(song);
    }

    public List<Song> getRecentlyPlayedSongs(User user) {
        if (store.containsKey(user)) {
            return store.get(user);
        }

        return Collections.emptyList();
    }
}
