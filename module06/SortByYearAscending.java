package Playlist;

import java.util.Comparator;

/**
 *
 */
public class SortByYearAscending implements Comparator<Song> {
    public int compare(Song s1, Song s2) {
        return s1.getYear() - s2.getYear();
    }
}
