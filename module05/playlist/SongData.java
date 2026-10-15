package Playlist;

public enum SongData {
    TITLE, ARTIST, GENRE, YEAR, TIMESPLAYED;


    public static SongData fromString(String value) {
        for(SongData data : SongData.values()) {
            if (data.toString().equalsIgnoreCase(value)) {
                return data;
            }
        }
        throw new IllegalArgumentException("No song with that data " + value);
    }
}
