package mediaLibraryApp;

/**
 *
 */
public class Book extends AbstractMedia {
    private int pages;

    public Book(String title, String genre, int pages) {
        super(title, genre);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String toCSV() {

        return this.title + "," + this.genre + "," + this.pages;
    }
}
