import java.util.ArrayList;

public class Spotijy {
    private Artist[] artists;

    public Spotijy(){
        this.artists = new Artist[0];
    }

    public Artist[] getArtists() {
        return artists;
    }
    public void addArtist(Artist[] artists){
        ArrayList<Artist> artistslist = new ArrayList<>();
        for (int i = 0; i < artists.length; i++) {
                Artist artist = artists[i];
                if(!artistslist.contains(artist)){
                    artistslist.add(artist);
                }
        }
        this.artists = artistslist.toArray(new Artist[0]);
    }
    public String[] getTopTrendingArtist(){
        Artist topArtist = null;

        for (int i = 0; i < artists.length ; i++) {
            Artist artist = artists[i];
            if (topArtist == null || artist.totalLikes() > topArtist.totalLikes()){
                topArtist = artist;
            }
        }
        return new String[] {topArtist.getFirstName(), topArtist.getLastName()};
    }

    public String getTopTrendingAlbum() {
        Album topAlbum = null;
        int topAlbumLikes = 0;
        int baseAlbumLikes = 0;

        Artist[] artists1 = this.artists;
        for (int i = 0; i < artists1.length; i++) {
            Artist artist = artists1[i];
            Album[] albums = artist.getAlbums();
            for (int j = 0; j < artists.length; j++) {
                Album album = albums[j];
                Song[] songs = album.getSongs();

                for (int k = 0; k < albums.length; k++) {
                    Song song = songs[k];
                    baseAlbumLikes += song.getLikes();
                }


                if (topAlbum == null || baseAlbumLikes > topAlbumLikes){
                    topAlbum = album;
                    topAlbumLikes = baseAlbumLikes;
                }

            }
        }
        assert topAlbum != null;
        return  topAlbum.getTitle();
    }
    public String getTopTrendingSong(){
        Song mostLikedSong = null;
        Song baselikes = null;

        Artist[] artists1 = this.artists;

        for (int i = 0; i <artists1.length ; i++) {
            Artist artist = artists1[i];
            mostLikedSong = artist.mostLikedSong();
            if (baselikes == null || mostLikedSong.getLikes() > baselikes.getLikes())
                mostLikedSong = baselikes;


        }
        return baselikes.getTitle();

    }


}
