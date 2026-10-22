package Playlist;

import java.util.*;

/**
 *
 */
public class PlaylistSongs {
    public static void main(String[] args) {
        Set<Song> songSet = new HashSet<>(Songs.getSongsShort());
        System.out.println(songSet);
        List<Song> songList = new ArrayList<>(Songs.getSongsShort());

        Collections.sort(songList, new ArtistCompareAsc());
        System.out.println(songList);



    }







//    private Optional<Song> checkToSeeIfSongExists(String str, Stream<Song> filtered) {
//        return filtered.filter(song -> song.getTitle().equalsIgnoreCase(str)).findFirst();
//    }



}
