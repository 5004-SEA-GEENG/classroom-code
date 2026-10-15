package mediaLibraryApp;

public enum MediaData {

    TITLE, TYPE, GENRE;

    
    public static MediaData fromString(String value) {
        for(MediaData data : MediaData.values()) {
            if (data.toString().equalsIgnoreCase(value)) {
                return data;
            }
        }

        throw new IllegalArgumentException("No media with that type " + value);
    }

}