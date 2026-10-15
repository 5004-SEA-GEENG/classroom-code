package mediaLibraryApp;

/**
 *
 */
public class Book extends AbstractMedia {
    private int pages;
    private String isbn;

    public Book(String title, String genre, int pages) {
        super(title, genre);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String getISBN() {
        return this.isbn;
    }

    @Override
    public MediaType getType() {
        return MediaType.BOOK;
    }

    public String toCSV() {

        return super.toCSV() + "," + this.pages;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", pages: " + pages;
    }
}
