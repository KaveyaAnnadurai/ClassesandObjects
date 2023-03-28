public class Main {


    public static void main(String[] args) {
        //for passing values to constructor with 3 parameters
        System.out.println("Passing 3 parameters to the constructor:");
        Movie movieObject = new Movie("Casino Productions","Eon Productions","PG-13");
        movieObject.printMovieDetails();
        System.out.println();

        //for passing values to constructor with 2 parameters
        System.out.println("Passing 2 parameters to the constructor:");
        Movie movieObject2 = new Movie("Don","Sk productions");
        movieObject2.printMovieDetails();
        System.out.println();

        //creating list to pass in getPg() method
        Movie obj= new Movie("A","B");
        Movie obj2 = new Movie("D","E");
        Movie obj3 = new Movie("F","G","I");
        Movie[] movieArray = new Movie[]{obj,obj2,obj3};

        //using the getPg method and printing those movies
        System.out.println("List of movies with rating as PG:");
        Movie[] moviesWithRatingPg = movieObject.getPg(movieArray);
        for(int i = 0; i < moviesWithRatingPg.length; i++){
           if(moviesWithRatingPg[i] != null)
                moviesWithRatingPg[i].printMovieDetails();
        }
    }
}
class Movie{
    private String title;
    private String studio;
    private String rating;
    int j=0;
    Movie(String title, String studio, String rating){
        this.title = title;
        this.rating = rating;
        this.studio = studio;
    }
    Movie(String title, String  studio){
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    void printMovieDetails(){
        System.out.print("Title: "+title);
        System.out.print(", Studio: "+studio);
        System.out.print(", Rating: "+rating);
        System.out.println();

    }
    Movie[] getPg(Movie movies[]){
        Movie[] moviesWithRatingPg = new Movie[movies.length];
        for(int i=0 ;i < movies.length; i++){
            if(movies[i].rating.equals("PG")){
                moviesWithRatingPg[j] =  movies[i];
                j++;
            }
        }
        return moviesWithRatingPg;
    }
}
