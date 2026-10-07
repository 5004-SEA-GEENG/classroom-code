package mediaLibraryApp;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 */
public class ConsoleView {
    private static final Scanner scanner = new Scanner(System.in);
    private static ConsoleView instance = null;
    private String helpDialog = "Commands:\n";

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
    public String getCommand(String s) {
        display(s);
        return scanner.nextLine();
    }

    public void registerCommand(String c) {
        helpDialog += c;
    }

    public void displayHelp() {
        //System.out.println("type help to list commands\n add to add to library\n quit\n save");
        display(helpDialog);
    }

    public void displayMedia(Stream<IMedia> mediaList) {
        mediaList.forEach(media -> System.out.printf("%s%n", media));
    }

    public List<String> addMedia() {
        MediaType type = MediaType.fromString(getCommand("What type of media is it?"));
        switch(type){
            case BOOK:
                return addBookMedia();
            case MUSIC:
                return addSongMedia();
            default:
                return null;
        }
    }

    public List<String> addBookMedia() {

        String title = getCommand("Whats the title?");
        String genre = getCommand("Whats the genre?");
        String pages = getCommand("How many pages?");
        return List.of(MediaType.BOOK.toString(),title,genre,pages);


    }
    public List<String> addSongMedia() {

        String title = getCommand("Whats the title?");
        String genre = getCommand("Whats the genre?");
        String isrc = getCommand("Whats the isrc?");
        String duration = getCommand("How long is it in seconds?");
        return List.of(MediaType.MUSIC.toString(),title,genre,isrc,duration);

    }
}
