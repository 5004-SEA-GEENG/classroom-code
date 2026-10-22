package Playlist;

import java.util.Comparator;

/**
 *
 */
public class Sorts {

    private Sorts(){}

    //some way/method to return a Comparator object based on SongData column, and boolean ascending

    public static Comparator<Song> getSortMethod(SongData column, boolean ascending) {
        switch(column) {
            case TITLE:
                if (ascending) {
                    return new TitleAscending();
                } else return new TitleDescending();
            case ARTIST:
                //return a comparator object that compares Artist
                if (ascending) {
                    return new ArtistAscending();
                } else return new ArtistDescending();
            case YEAR:
                return ascending ? new YearAscending() : new YearDescending();

            case GENRE:
                //ascending
                return ascending ? (s1, s2) -> s1.getGenre().compareTo(s2.getGenre()) :
                        (Song s1, Song s2) -> s2.getGenre().compareTo(s1.getGenre());
             default:
                return new ArtistAscending();
        }
    }

    public static class YearAscending implements Comparator<Song> {
        public int compare(Song s1, Song s2) {
            return s1.getYear() - s2.getYear();
        }
    }

    public static class YearDescending implements Comparator<Song> {
        public int compare(Song s1, Song s2) {
            return s2.getYear() - s1.getYear();
        }
    }
    public static class TitleAscending implements Comparator<Song> {
        public int compare(Song s1, Song s2) {
            return s1.getTitle().toLowerCase().compareTo(s2.getTitle());
        }
    }

    public static class TitleDescending implements Comparator<Song> {
        public int compare(Song s1, Song s2) {
            return s2.getTitle().toLowerCase().compareTo(s2.getTitle());
        }
    }


    //Artist compare classes
    //ascending version
    public static class ArtistAscending implements Comparator<Song> {
        public int compare(Song s1, Song s2) {
            return s1.getArtist().toLowerCase().compareTo(s2.getArtist().toLowerCase());
        }
    }
    //descending, case insensitive

    public static class ArtistDescending implements Comparator<Song> {
        public int compare(Song s1, Song s2) {
            return s2.getArtist().toLowerCase().compareTo(s1.getArtist().toLowerCase());
        }
    }

}
