package mediaLibraryApp;

public enum MediaType {
    BOOK,MUSIC;

    public static MediaType fromString(String type) {
        switch(type.toUpperCase()) {
            case "BOOK":
                return BOOK;
            case "MUSIC":
                return MUSIC;
            default:
                return null;
        }
    }

}
