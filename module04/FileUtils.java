package mediaLibraryApp;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class FileUtils {
    //reading and writing to files
    public static void buildLibrary(Library library, String url){
        //loads media from csv file into library

        //read file into list of strings
        List<String> list = Collections.emptyList();
        try{
            list = Files.readAllLines(Path.of(url));
            list.stream().map(IMedia::fromCSV).forEach(library::addMedia);


        } catch (IOException e) {
            System.out.println("Can't find file" + e.getMessage());
            e.printStackTrace();
        }


    }

    public static void saveLibrary(Library library, String url) {
        //System.out.println(System.getProperty("user.dir"));

        try  {

            //exceptions are difficult to propogate out of lambda, so this is difficult
            //library.getMediaList().map(IMedia::toString).forEach(f::write);
            //missing type currently
            List<String> list= library.getMediaList().map(IMedia::toCSV).toList();
            Files.write(Path.of(url), list);

        } catch(IOException e) {
            System.out.println("Can't access file. " + e.getMessage());
            e.printStackTrace();
        }
    }
}
