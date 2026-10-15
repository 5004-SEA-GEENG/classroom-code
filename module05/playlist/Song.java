package Playlist;

import java.util.Locale;
import java.util.Objects;

public class Song implements Comparable<Song> {
    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timesPlayed;

    public Song(String title, String artist, String genre,
                int year, int timesPlayed) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timesPlayed = timesPlayed;
    }

    public String getTitle() {
        return this.title;
    }
    public String getArtist() {
        return this.artist;
    }
    public String getGenre() {
        return this.genre;
    }
    public int getYear() {
        return this.year;
    }
    public int getTimesPlayed() {
        return this.timesPlayed;
    }

    @Override
    public String toString() {
        String string = "Title: " + this.getTitle() +
                " Artist: " + this.getArtist() +
                " Genre: " + this.getGenre() +
                " Year: " + this.getYear() +
                " Times Played " + this.getTimesPlayed() +
                "\n";
        return string;
    }

    @Override
    public boolean equals(Object other) {
        //if the object is exactly the same object -> reference points to same palce
        if (this == other) {
            return true;
        }
        //if the object is null
        //if the object's class is the same as other's class
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        //are all the traits the same
        //year released
        //genre
        Song otherSong = (Song) other;
        return this.title.equals(otherSong.title)
                && this.artist.equals(otherSong.artist)
                && this.year == otherSong.year
                && this.genre.equals(otherSong.genre);


    }

    @Override
    public int hashCode() {
        //Objects.hash()
        return Objects.hash(this.title, this.artist,
                this.year, this.genre);
    }

    @Override
    public int compareTo(Song s2) {
        return this.title.compareTo(s2.title);
    }


}