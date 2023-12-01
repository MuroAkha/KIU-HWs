public class Song {

    private String  title;

    private int releaseYear;

    private int duration = 60;

    private int likes;

    public Song(String Title, int releaseYear,int duration, int likes){

        this.duration = duration;
        this.releaseYear = releaseYear;
        this.title = Title;

        this.likes = likes;
    }
    public Song(String Title, int releaseYear,int duration){

        this.duration = duration;
        this.releaseYear = releaseYear;
        this.title = Title;

    }
    public Song(String Title, int releaseYear){

        this.releaseYear = releaseYear;
        this.title = Title;

    }



    public int getDuration() {
        return duration ;
    }

    public int getLikes() {
        return likes;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTitle(String Title) {
        this.title = Title;
    }

    public boolean changeDuration(int duration){
        if(this.duration==duration || duration<0 || duration > 720)
            return false;
        else
            this.duration = duration;
            return true;
    }
    void like(){
        likes++;
    }
    void unlike(){
        likes--;
        if (likes < 0)
            likes = 0;
    }

    public boolean isEqual(Song other){
        return this.title.equals(other.title) &&
                this.releaseYear == other.releaseYear &&
                this.duration == other.duration;
    }
@Override
    public String toString() {
        return "Title:" +title +
                ",Duration:" +(double)duration/60 +" minutes;" +
                ",Release Year:" +releaseYear +
                ",Likes:" +likes;
    }
}
