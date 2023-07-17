public class Movie {
    int a;
    String movieName;
    String heroName;
    int budget;

    public void m1() {
        movieName = "kgf";
        System.out.println("movie name is " + movieName);
    }

    public void m2(String budget) {
        System.out.println("budget is so high " + budget);
    }

    public void superHero() {
        System.out.println("The biggest acter of the era is srk");
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.m1();
        movie.m2("2.5 cr");
        movie.superHero();
        System.out.println("===================================================================");
        Movie mo = new Movie();
        mo.m1();
        mo.m2("2.8 cr");
        mo.superHero();
        System.out.println("===================================================================");

        Movie noEntry = new Movie();
        noEntry.m1();
        noEntry.m2("1.1cr");
        noEntry.superHero();

    }
}
