package Playlist;

import java.util.Comparator;

/**
 *
 */
public class ArtistCompareAsc implements Comparator<Song>{
    public int compare(Song s1, Song s2) {
            return s1.getArtist().compareTo(s2.getArtist());
        }
//    public static class ArtistCompareAsc implements Comparator<Song> {
//        public int compare(Song s1, Song s2) {
//            return s1.getArtist().compareTo(s2.getArtist());
//        }
//    }
//
//    public static class ArtistCompareDesc implements Comparator<Song> {
//        public int compare(Song s1, Song s2) {
//            return s2.getArtist().compareTo(s1.getArtist());
//        }
//    }
}
