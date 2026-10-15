package Playlist;

import jdk.dynalink.Operation;

import java.nio.charset.StandardCharsets;

import static Playlist.SongData.*;
import static Playlist.Operations.*;

/**
 * Strategy pattern
 */
public final class Filters {
    private Filters () {}

    //return boolean
    public static boolean filter(SongData col, String value, Song song, Operations oper) {
        switch(col) {
            case TITLE:
                return filterString(song.getTitle(), oper, value);
            case GENRE:
                return filterString(song.getGenre(), oper, value);
            case ARTIST:
                return filterString(song.getArtist(), oper, value);
            case YEAR:
                return filterNumber(song.getYear(), oper, value);
            default:
                return false;
        }

    }

    public static boolean filterString(String songValue, Operations oper,String value) {
        switch(oper) {
            case EQUALS:
                return songValue.equalsIgnoreCase(value);
            case NOT_EQUALS:
                return !songValue.equalsIgnoreCase(value);
            case CONTAINS:
                return false;
            case GREATER_THAN:
                return songValue.compareTo(value) > 0;
            case LESS_THAN:
                return songValue.compareTo(value) < 0;
            default:
                return false;
        }
    }

    private static boolean filterNumber(double mediaValue, Operations op, String value) {
        double filterValue;
        try {
            filterValue = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return false;
        }
        switch (op) {
            case EQUALS:
                return mediaValue == filterValue;
            case NOT_EQUALS:
                return mediaValue != filterValue;
            case GREATER_THAN:
                return mediaValue > filterValue;
            default:
                return false;
        }
    }
}
