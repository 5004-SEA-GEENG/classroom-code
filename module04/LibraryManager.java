package mediaLibraryApp;

/**
 *
 */
public class LibraryManager {
    private final ConsoleView view;
    private final Library library;

    public LibraryManager(ConsoleView view, Library library) {
        this.view = view;
        this.library = library;
    }


    public void run(String lib) {
        //runs program
        library.loadLibrary(lib);
        view.displayMedia(library.getMediaList());
        view.displayHelp();

        String cmd = view.getCommand();
        //System.out.println(cmd);

        while (cmd!= null) {
            Command command = Command.fromString(cmd);
            switch(command) {
                case HELP:
                    view.displayHelp();
                    break;
                case ADD:
                    addMedia();
                    break;
                case QUIT:
                    System.out.println("Exiting program");
                    System.exit(0);
                    break;
                case SAVE:
                    view.display("Saving to file");
                    FileUtils.saveLibrary(library, "resources/saved.csv");


            }
            view.displayHelp();
            cmd = view.getCommand();
        }
    }

    public void addMedia() {
        view.display("What type of media is it?");
        MediaType type = MediaType.fromString(view.getCommand());
        switch(type){
            case BOOK:
                addBookMedia();
                break;

        }
        view.display("Added!");
        view.displayMedia(library.getMediaList());
    }

    //can reduce duplicate code by making a promptClientInput method like python input()
    //this is client interaction, so I should move to ConsoleView
    //Should return some list that LibraryManager to handle
    //but i'm lazy
    public void addBookMedia() {
        view.display("Whats the title?");
        String title = view.getCommand();
        view.display("Whats the genre?");
        String genre = view.getCommand();
        view.display("How many pages?");
        String pages = view.getCommand();

        library.addMedia(new Book(title, genre, Integer.parseInt(pages)));
    }


}
