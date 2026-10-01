package mediaLibraryApp;

public enum Command {
    HELP, ADD, QUIT, SAVE;

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
