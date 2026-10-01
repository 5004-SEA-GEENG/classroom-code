package mediaLibraryApp;

/**
 *
 */
public class Song extends AbstractMedia {
    private String title;
    private int duration; //in seconds

    public Song(String title, String genre, int duration) {
        super(title, genre);
        this.duration = duration;
    }

    public String toCSV() {

        return this.title + "," + this.genre + "," + this.duration;
    }


}
