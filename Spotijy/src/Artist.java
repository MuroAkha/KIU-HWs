public class Artist {
    private String firstName;
    private String lastName;
    private int birthYear;

    private Album[] albums;

    private Song[] singles;

    public Album[] getAlbums() {
        return albums;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Song[] getSingles() {
        return singles;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }

    public void setSingles(Song[] singles) {
        this.singles = singles;
    }


    public Artist(String firstName, String lastName, int birthYear){

        this.lastName = lastName;
        this.firstName = firstName;

        this.birthYear =birthYear;
    }

    public Song mostLikedSong(){
        Song mostLiked = null;

        for (int i = 0; i < singles.length; i++) {
            Song single = singles[i];
            if (mostLiked == null || single.getLikes() > mostLiked.getLikes())
                mostLiked = single;
        }
        for (int i = 0; i < albums.length ; i++) {
            Album album = albums[i];
            Song[] songs = album.getSongs();
            for (int j = 0; j <songs.length ; j++) {
                Song song = songs[j];
                if (mostLiked == null || song.getLikes()> mostLiked.getLikes())
                    mostLiked = song;
            }
        }
        return mostLiked;
    }public Song leastLikedSong(){
        Song leastLiked = null;

        for (int i = 0; i < singles.length; i++) {
            Song single = singles[i];
            if (leastLiked == null || single.getLikes() < leastLiked.getLikes())
                leastLiked = single;
        }
        for (int i = 0; i < albums.length ; i++) {
            Album album = albums[i];
            Song[] songs = album.getSongs();
            for (int j = 0; j <songs.length ; j++) {
                Song song = songs[j];
                if (leastLiked == null || song.getLikes()< leastLiked.getLikes())
                    leastLiked = song;
            }
        }
        return leastLiked;
    }
    public int totalLikes() {
        Song single = null;
        Song song = null;
        for (int i = 0; i < singles.length; i++) {
            single = singles[i];
        }
        for (int i = 0; i < albums.length; i++) {
            Album album = albums[i];
            Song[] songs = album.getSongs();
            for (int j = 0; j < songs.length; j++) {
                song = songs[j];


            }
        }
        return single.getLikes() + song.getLikes();
    }

    public boolean isEqual(Artist other){
        return this.firstName.equals(other.firstName) &&
                this.lastName.equals(other.lastName) &&
                this.birthYear == other.birthYear;
    }
    public String toString(){

        StringBuilder representation = new StringBuilder();

        representation.append("Name: ").append(this.firstName).append(" ").append(this.lastName).append(",");
        representation.append("Birth year:").append(this.birthYear).append(',');
        representation.append("Total likes: ").append(this.totalLikes());

        return representation.toString();
    }
}
