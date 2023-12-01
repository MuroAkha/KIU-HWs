public class Main {
    public static void main(String[] args) {


    Song mss = new Song("aer",12,3);
    Song sad = new Song("asd",123);
        Song rattlestarSong = new Song("Snake Jazz", 1989, 60);

        Song majorSong = new Song("Space Oddity", 1969, 315);


        System.out.println(rattlestarSong.toString());

        Album greenSide = new Album("Green side",1976);
        System.out.println(greenSide.getTitle());
        greenSide.addSongs(new Song[]{rattlestarSong});

        System.out.println();
    }




}