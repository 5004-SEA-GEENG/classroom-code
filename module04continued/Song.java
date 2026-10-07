package mediaLibraryApp;

/**
 *
 */
public class Song extends AbstractMedia implements IAudioMedia {
    private String isrc;
    private int timeBySeconds;

    public Song(String title, String genre, String isrc, int timeBySeconds) {
        super(title, genre);
        this.timeBySeconds = timeBySeconds;
        this.isrc = isrc;
    }
    @Override
    public MediaType getType() {
        return MediaType.MUSIC;
    }

    public String toCSV() {
        //System.out.println(title);
        return super.toCSV() + "," + isrc + "," + timeBySeconds;
    }
    @Override
    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", ISRC: " + isrc + ", duration: " + timeBySeconds;
    }


    @Override
    public int getTimeBySeconds() {
        return this.timeBySeconds;
    }

    @Override
    public String getISRC() {
        return this.isrc;
    }
}
