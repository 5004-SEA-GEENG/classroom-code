package Playlist;

import java.util.*;

/**
 *
 */
public class PlaylistSongs {
    public static void main(String[] args) {
        Set<Song> songSet = new HashSet<>(Songs.getSongsShort());
        Set<Song> sortedSongs = new TreeSet<>();
        sortedSongs.addAll(songSet);
        System.out.println(sortedSongs);

//        System.out.println(songSet);
//        List<Song> songList = new ArrayList<>(Songs.getSongsShort());
//
//        Collections.sort(songList, Sorts.getSortMethod(SongData.ARTIST, false));
//        System.out.println(songList);

        Map<Integer,String> stringMap = new HashMap<>();
        stringMap.put(1, "banaba");
        stringMap.put(2, "potato");
        stringMap.put(3, "cauliflower");
        System.out.println(stringMap.get(3));

        System.out.println(stringMap.keySet());
        System.out.println(stringMap.values());

    }







//    private Optional<Song> checkToSeeIfSongExists(String str, Stream<Song> filtered) {
//        return filtered.filter(song -> song.getTitle().equalsIgnoreCase(str)).findFirst();
//    }



}
