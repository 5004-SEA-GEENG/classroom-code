package Playlist;

import java.util.*;
import java.util.stream.Stream;

/**
 *
 */
public class PlaylistSongs {
    public static void main(String[] args) {
        Set<Song> songSet = new HashSet<>(Songs.getSongs());
        Set<Song> sortedSongSet = new TreeSet<>(new SortByArtist());
        sortedSongSet.addAll(songSet);
        System.out.println(sortedSongSet);
        //System.out.println(songSet);

        //filter in songs that are called Ditto
//        List<Song> newJeans = songSet.stream()
//                .filter(song -> Filters.filter(SongData.TITLE, "Ditto", song, Operations.CONTAINS)).toList();

        //Collections.sorted(songSet);

        //List<Song> songList = Songs.getSongs().stream().sorted(new SortByArtist()).toList();
        //System.out.println(songList);

    }


    public static class SortByArtist implements Comparator<Song> {
        public int compare(Song o1, Song o2) {
            return o1.getArtist().compareTo(o2.getArtist());
        }
    }
    public static class SortByTitle implements Comparator<Song> {

        @Override
        public int compare(Song o1, Song o2) {

            return o1.getTitle().compareTo(o2.getTitle());
        }
    }


}
