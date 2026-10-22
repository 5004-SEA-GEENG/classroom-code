package Playlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class PlaylistStrings {
    public static void main(String[] args) {

        List<String> songs = new ArrayList<>(List.of("Zeppelin", "D", "Ditto", "Ditto", "ditto", "BAILE INoLVIDABLE", "Toxic"));
        //System.out.println(songs.stream().sorted().toList());
        Collections.sort(songs);
        System.out.println(songs);
        String song1 = "Ditto";
        System.out.println(song1.compareTo("ditto"));




    }
}
