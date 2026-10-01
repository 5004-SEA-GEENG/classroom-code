package mediaLibraryApp;

/**
 *
 */
public class MainApp {
    private final static String DEFAULT_LIBRARY_FILE = "resources/library.csv";
    public static void main(String[] args) {
        Library lib = new Library();
        ConsoleView view = ConsoleView.getInstance();
        LibraryManager lm = new LibraryManager(view, lib);
        //System.out.println(System.getProperty("user.dir"));
        lm.run(DEFAULT_LIBRARY_FILE);
    }
}
