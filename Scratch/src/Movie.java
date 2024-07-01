class Movie {
    //Fields (instance variables)
    private String title;
    private int releaseYear;
    private double revenue;

    //no arg/default constructor
    public Movie(){
    }

    public Movie(String title){
        setTitle(title);
    }

    //constructors - these get called when the client says "new"
    public Movie(String title, int releaseYear, double revenue){
        this(title); //delegate to ctor(constructor) above for title
        setReleaseYear(releaseYear);//handle the rest of them myself by delegating to respective setters
        setRevenue(revenue);
    }

    //actions (methods)
    /*
     * play
     * pause
     * rewind
     */

    //accessor methods for private fields (getters, setters)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public String toString(){
        return "Movie: Title = " + getTitle() + ", Release Year = " + getReleaseYear() + ", Revenue = " + getRevenue();
    }
}