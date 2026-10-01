package mediaLibraryApp;

public interface IMedia {
    String getTitle();
    String getGenre();

    String toCSV();

    //media build
    //String -> mediaLibraryApp.IMedia type
    //Should be written so I can use stream on List<String> to create mediaLibraryApp.IMedia
    //then added to library
    //e.g., m = list.stream().map(mediaLibraryApp.IMedia::fromCSV).forEach(library::addMedia)

    public static IMedia fromCSV(String s) {
        String[] data = s.split(",");
        String title = data[1];
        String genre = data[2];
        Integer length = Integer.parseInt(data[3]);
        MediaType type = MediaType.fromString(data[0]);

        switch(type) {
            case BOOK:
                return new Book(title, genre, length);
            case MUSIC:
                return new Song(title, genre, length);
            default:
                return null;
        }

    }

}
