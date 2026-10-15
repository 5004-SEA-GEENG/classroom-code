package mediaLibraryApp;

public enum Command {
    HELP("help","Get a list of possible commands."),
    ADD("add", "Add new media to the library."),
    QUIT("quit", "Ends the program."),
    SAVE("save", "Save current library to a csv file.");

    private final String label;
    private final String description;
    private Command(String label, String description) {
        this.label = label;
        this.description = description;
    }

    public String getLabel() {
        return this.label;
    }
    public String getDisplayDesc() {
        return " | " + this.description + "\n";
    }

    public static Command fromString(String cmd) {
//        String[] input = cmd.split(" ");
//        switch(input[0].toUpperCase()) {
//            case "HELP":
//                return HELP;
//            case "ADD":
//                return ADD;
//            case "QUIT":
//                return QUIT;
//            default:
//                return null;
//        }
        //values() contains all values of enum
        for( Command c : Command.values()) {
            if (cmd.toLowerCase().contains(c.name().toLowerCase())) {
                //System.out.println(c.name());
                return c;
            }
        }
        return null;
    }
}
