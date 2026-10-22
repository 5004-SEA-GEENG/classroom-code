package Playlist;

/**
 * Strategy pattern
 */
public final class Filters {
    private Filters () {}

    //return boolean
    public static boolean filter(SongData col, String value, Song song, Operations oper) {
        switch(col) {
            case TITLE:

                return stringFilter(song.getTitle(), value, oper);
            case ARTIST:
                return song.getArtist().equalsIgnoreCase(value);
            case YEAR:
            default:
                return false;
        }

    }

    public static boolean stringFilter(String songValue, String value, Operations oper) {
        switch(oper) {
            case EQUALS:
                return songValue.equalsIgnoreCase(value);
            case NOT_EQUALS:
                return !songValue.equalsIgnoreCase(value);
            case CONTAINS:
                return songValue.toLowerCase().contains(value.toLowerCase());
            case GREATER_THAN:
                return songValue.compareTo(value) > 0;
            case LESS_THAN:
                return songValue.compareTo(value) < 0;
            default:
                return false;
        }
    }
}
