package Playlist;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 */
public class PlaylistStrings {
    public static void main(String[] args) {

        List<String> songs = List.of("Ditto", "Ditto", "ditto", "BAILE INoLVIDABLE", "Toxic");
        System.out.println(songs.stream().sorted().toList());

//        Set<String> songSet = new HashSet<>(songs);
//        System.out.println(songSet);

    }
}
