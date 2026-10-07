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
        //get commands
        for (Command c : Command.values()) {
            String toAdd = c.getLabel() + c.getDisplayDesc();
            view.registerCommand(toAdd);
        }
    }


    public void run(String lib) {
        //runs program
        library.loadLibrary(lib);
        view.displayMedia(library.getMediaList());
        view.displayHelp();

        String cmd = view.getCommand("What would you like to do?");
        //System.out.println(cmd);

        while (cmd!= null) {
            Command command = Command.fromString(cmd);
            switch(command) {
                case HELP:
                    view.displayHelp();
                    break;
                case ADD:
                    IMedia m = IMedia.fromList(view.addMedia());
                    library.addMedia(m);
                    view.display("Added " + m.toString());
                    break;
                case QUIT:
                    System.out.println("Exiting program");
                    System.exit(0);
                    break;
                case SAVE:
                    view.display("Saving to file");
                    FileUtils.saveLibrary(library, "resources/saved.csv");
                    break;
                default:
                    view.display("Not a legal command.");

            }
            view.displayHelp();
            cmd = view.getCommand("What would you like to do?");
        }
    }




}
