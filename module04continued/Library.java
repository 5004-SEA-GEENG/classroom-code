package mediaLibraryApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 */
public class Library {
    private List<IMedia> mediaList;

    public Library() {
        mediaList = new ArrayList<>();
    }

    public void addMedia(IMedia media) {
        this.mediaList.add(media);
    }

    public Stream<IMedia> getMediaList() {
        return mediaList.stream();
    }


    //technically these should be placed in other classes for View and Model

    public void loadLibrary(String libraryFile) {
        FileUtils.buildLibrary(this,libraryFile);
    }






}
