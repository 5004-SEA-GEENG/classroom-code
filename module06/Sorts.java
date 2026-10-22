package Playlist;

import java.util.Comparator;

/**
 *
 */
public class Sorts {
    private Sorts() {}

    //takes SongData col and boolean ascending
    public static Comparator<Song> sort(SongData column, boolean ascending) {
        switch(column) {
            case TITLE:
                if(ascending) {
                    return new TitleCompareAsc();
                }
            default:
                return null;
        }
    }

    public static class TitleCompareAsc implements Comparator<Song> {
        public int compare(Song s1, Song s2) {
            return s1.getTitle().compareTo(s2.getTitle());
        }
    }
}
