public class Theatre {
    String movieName;
    int movie_time;
    public Theatre(String movieName, int movie_time) {
        this.movieName = movieName;
        this.movie_time = movie_time;
    }
    public void watch_movie() {
        System.out.println("Watching " + movieName);
        System.out.println("Show Time is " + movie_time);
    }
    public static void main(String[] args) {
        Theatre movie1 = new Theatre("Jailer", 630);
        Theatre movie2 = new Theatre("Leo", 7);                      
        movie1.watch_movie();   
        movie2.watch_movie();
    }
}
