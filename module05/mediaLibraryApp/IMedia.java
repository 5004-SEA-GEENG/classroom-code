package mediaLibraryApp;

import java.util.List;

public interface IMedia {
    String getTitle();
    String getGenre();
    MediaType getType();
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
        String fileNumber = data[3];
        MediaType type = MediaType.fromString(data[0]);

        switch(type) {
            case BOOK:
                return new Book(title, genre, Integer.parseInt(data[3]));
            case MUSIC:
                return new Song(title, genre, fileNumber,Integer.parseInt(data[4]));
            case AUDIOBOOK:
                return new AudioBook(title, genre, fileNumber, Integer.parseInt(data[4]));
            default:
                return null;
        }

    }

    public static IMedia fromList(List<String> s) {
        MediaType type = MediaType.fromString(s.get(0));
        switch (type) {
            case BOOK:
                return new Book(s.get(1),s.get(2), Integer.parseInt(s.get(3)));
            case MUSIC:
                return new Song(s.get(1),s.get(2),s.get(3), Integer.parseInt(s.get(4)));
            default:
                return null;
        }

    }

}
