package mediaLibraryApp;

public enum MediaType {
    BOOK,MUSIC, AUDIOBOOK;

    public static MediaType fromString(String type) {
        switch(type.toUpperCase()) {
            case "BOOK":
                return BOOK;
            case "MUSIC":
                return MUSIC;
            case "AUDIOBOOK":
                return AUDIOBOOK;
            default:
                return null;
        }
    }

}
