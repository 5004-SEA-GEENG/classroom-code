package mediaLibraryApp;

/**
 *
 */
public class AudioBook extends Book implements IAudioMedia {
    private String isrc;
    private int timeBySeconds;


    private static final double price = 5.99;
    private static final int max_pages = 0;

    public AudioBook(String title, String genre,
                     String isrc, int timeBySeconds ) {
        super(title, genre, max_pages);
        this.isrc = isrc;
        this.timeBySeconds = timeBySeconds;
    }

    @Override
    public int getTimeBySeconds() {
        return timeBySeconds;
    }

    @Override
    public String getISRC() {
        return isrc;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + isrc + "," + timeBySeconds;
    }

    public MediaType getType() {
        return MediaType.AUDIOBOOK;
    }


    public static void main(String[] args) {
//        AudioBook book = new AudioBook("Digital Audio Book Title", "Fiction", "US-ABC-23-45678", 12,6240);
//        System.out.println("Title: " + book.getTitle());
//        System.out.println("Genre: " + book.getGenre());
//        System.out.println("Pages: " + book.getPages());
//        System.out.println("ISRC: " + book.getISRC());
//        System.out.println("Time (seconds): " + book.getTimeBySeconds());
//        //System.out.println("Price: $" + book.getPrice());
//        System.out.println(book);
//        System.out.println(book.toCSV());
    }
}
