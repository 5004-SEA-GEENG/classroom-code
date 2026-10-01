package mediaLibraryApp;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 */
public class ConsoleView {
    private static final Scanner scanner = new Scanner(System.in);
    private static ConsoleView instance = null;

    public static ConsoleView getInstance() {
        if (instance == null) {
            instance = new ConsoleView();
        }
        return instance;
    }

    public void display(String output) {
        System.out.println(output);
    }

    //mediaLibraryApp.ConsoleView handles getting commands from commandline
    public String getCommand() {
        return scanner.nextLine();
    }

    public void displayHelp() {
        System.out.println("type help to list commands\n add to add to library\n quit\n save");
    }

    public void displayMedia(Stream<IMedia> mediaList) {
        mediaList.forEach(media -> System.out.printf("%s%n", media));
    }
}
