import java.util.ArrayList;
import java.util.Arrays;


public class Album {
    private String title;

    private int releaseYear;

    private Song[] songs;

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Song[] getSongs() {
        return songs;
    }

    public Album(String title, int releaseYear){

        this.releaseYear = releaseYear;

        this.title = title;

    }

    public int addSongs(Song[] songs) {
        if (this.songs == null) {
            this.songs = songs;
            return songs.length;
        }

        int count = 0;

        ArrayList<Song> newSongs = new ArrayList<>(Arrays.asList(this.songs));

        for (Song song : songs) {

            if (!newSongs.contains(song)) {
                newSongs.add(song);
                count++;
            }

        }
        this.songs = newSongs.toArray(new Song[0]);
        return count;
    }

    public Song[] shuffle(){
      Song[] shuffledCopy = this.songs.clone();

      int len = shuffledCopy.length;
      int target;
      Song temp;

      for (int i = len -1; i>0; i--){
          target= (int)(Math.random() * (i +1 ));

          temp = shuffledCopy[i];
          shuffledCopy[i] = shuffledCopy[target];
          shuffledCopy[target] = temp;
      }
      return shuffledCopy;

    }






    public Song[] sortByTitle(boolean isAscending) {
        if (isAscending) {
            selectionSort(songs);
        }
        if(!isAscending){
            selectionSort(songs);
             reverse(songs);
        }
        return songs;
    }

    private static void selectionSort(Song[] songs){            // title sort
        for (int i = 0; i < songs.length; i++) {
            for (int j = i + 1; j < songs.length; j++) {

                if (songs[i].toString().compareTo(songs[j].toString()) > 0) {
                    Song temp = songs[i];
                    songs[i] = songs[j];
                    songs[j] = temp;
                }
            }
        }
    }


    public Song[] sortByPopularity(boolean isAscending){
        if (isAscending) {
            mergeSort(songs);
        }
        if(!isAscending){
            mergeSort(songs);
            reverse(songs);
        }
        return songs;
    }
    private  void mergeSort(Song[] arr){            //  popularity merge
        if (arr == null || arr.length ==1 )
            return;

        int len = arr.length;
        int halfLength = len / 2;

        Song[] leftHalf = new Song[halfLength];
        Song[] rightHalf = new Song[len-halfLength];

        for (int i = 0; i <leftHalf.length ; i++) {
            leftHalf[i] = arr[i];
        }
        for (int i = halfLength; i < len; i++) {
            rightHalf[i-halfLength] = arr[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        sort(arr,leftHalf,rightHalf);
    }

    private  void sort(Song[] array, Song[] left, Song[] right){        // popularity sort
        int leftLen = songs.length / 2;
        int rightLen = songs.length - leftLen;
        int i = 0;
        int l = 0;
        int r = 0;

        while (l < leftLen && r < rightLen) {
            if (left[l].getLikes() < right[r].getLikes()) {
                songs[i] = left[l];
                i++;
                l++;
            } else {
                songs[i] = right[r];
                i++;
                r++;
            }
        }
        while (l < leftLen) {
            songs[i] = left[l];
            i++;
            l++;
        }

        while (r < rightLen) {
            songs[i] = right[r];
            i++;
            r++;
        }
    }

    public Song[] sortByDuration(boolean isAscending){
        if (isAscending) {
            mergeSort1(songs);
        }
        if(!isAscending){
            mergeSort1(songs);
            reverse(songs);
        }
        return songs;
    }
    private  void mergeSort1(Song[] arr){           //duration merge
        if (arr == null || arr.length ==1 )
            return;

        int len = arr.length;
        int halfLength = len / 2;

        Song[] leftHalf = new Song[halfLength];
        Song[] rightHalf = new Song[len-halfLength];

        for (int i = 0; i <leftHalf.length ; i++) {
            leftHalf[i] = arr[i];
        }
        for (int i = halfLength; i < len; i++) {
            rightHalf[i-halfLength] = arr[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        sort1(arr,leftHalf,rightHalf);
    }

    private  void sort1(Song[] array, Song[] left, Song[] right){   // duration sort
        int leftLen = songs.length / 2;
        int rightLen = songs.length - leftLen;
        int i = 0;
        int l = 0;
        int r = 0;

        while (l < leftLen && r < rightLen) {
            if (left[l].getDuration() < right[r].getDuration()) {
                songs[i] = left[l];
                i++;
                l++;
            } else {
                songs[i] = right[r];
                i++;
                r++;
            }
        }
        while (l < leftLen) {
            songs[i] = left[l];
            i++;
            l++;
        }

        while (r < rightLen) {
            songs[i] = right[r];
            i++;
            r++;
        }
    }
    public Song[] sortByReleaseYear(boolean isAscending){
        if (isAscending) {
            mergeSort2(songs);
        }
        if(!isAscending){
            mergeSort2(songs);
            reverse(songs);
        }
        return songs;
    }


    private  void mergeSort2(Song[] arr){           // release year  merge
        if (arr == null || arr.length ==1 )
            return;

        int len = arr.length;
        int halfLength = len / 2;

        Song[] leftHalf = new Song[halfLength];
        Song[] rightHalf = new Song[len-halfLength];

        for (int i = 0; i <leftHalf.length ; i++) {
            leftHalf[i] = arr[i];
        }
        for (int i = halfLength; i < len; i++) {
            rightHalf[i-halfLength] = arr[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        sort1(arr,leftHalf,rightHalf);
    }

    private  void sort2(Song[] array, Song[] left, Song[] right){           // release year sort
        int leftLen = songs.length / 2;
        int rightLen = songs.length - leftLen;
        int i = 0;
        int l = 0;
        int r = 0;

        while (l < leftLen && r < rightLen) {
            if (left[l].getDuration() < right[r].getDuration()) {
                songs[i] = left[l];
                i++;
                l++;
            } else {
                songs[i] = right[r];
                i++;
                r++;
            }
        }
        while (l < leftLen) {
            songs[i] = left[l];
            i++;
            l++;
        }

        while (r < rightLen) {
            songs[i] = right[r];
            i++;
            r++;
        }
    }

    public static Song[] reverse(Song[]songs) {             // reverse song
        int left = 0;
        int right = songs.length - 1;
        while (left < right) {
            Song temp = songs[left];
            songs[left] = songs[right];
            songs[right] = temp;
            left++;
            right--;
        }
        return songs;


    }


    @Override
    public String toString() {
        StringBuilder bld = new StringBuilder();

        bld.append("Title:").append(this.title);
        bld.append(",Release year:").append(this.releaseYear);
        bld.append(",songs:{");

        for (Song song: this.songs)
            bld.append(song.toString()).append("|");

        bld.append("}");

        return bld.toString();
    }

}
