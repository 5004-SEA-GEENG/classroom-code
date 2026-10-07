package mediaLibraryApp;

import static java.lang.Character.getType;

/**
 *
 */
public abstract class AbstractMedia implements IMedia {
    protected String title;
    protected String genre;

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Genre: " + genre;
    }

    @Override
    public String toCSV() {
        return getType() + "," + title + "," + genre;
    }

    public AbstractMedia(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }
}
