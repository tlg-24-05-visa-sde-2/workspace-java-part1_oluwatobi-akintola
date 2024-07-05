class Movie {
    //Fields (instance variables)
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating = Rating.PG;
    private Genre genre;

    //no arg/default constructor

    public Movie(String title){
        setTitle(title);
    }

    public Movie(String title, Genre genre){
        this(title);
        setGenre(genre);
    }

    //constructors - these get called when the client says "new"
    public Movie(String title, Integer releaseYear, Double revenue , Rating rating, Genre genre){
        this(title, genre); //delegate to ctor(constructor) above for title, and genre
        setReleaseYear(releaseYear);//handle the rest of them myself by delegating to respective setters
        setRevenue(revenue);
        setRating(rating);
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

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString(){
        //TODO: Make it right, so that a null revenue shows up as null
        //and a non-null revenue shows up as 123,000,345.94
        //HINT: if revenue is null, use %s, otherwise

        return String.format("Movie: title = %s, releaseYear = %s, revenue = %,.2f, rating = %s, genre = %s ",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre(), getGenre());

//        return "Movie: Title = " + getTitle() + ", Release Year = " + getReleaseYear() + ", Revenue = " + getRevenue()
//                + ", Rating = " + getRating() + ", Genre = " + getGenre();
    }
}