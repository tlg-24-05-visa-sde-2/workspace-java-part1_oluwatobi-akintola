package net.flix;

enum Genre {
    ANIME("Anime"),                 //each of these is calling the genre() ctor below
    DRAMA("Drama"),
    HORROR("Horror"),
    ROMANTIC_COMEDY("Romantic Comedy"),
    DOCUMENTARY("Documentary"),
    MYSTERY("Mystery"),
    SCI_FI("Sci-Fi"),
    INTERNATIONAL("International");

    //everything under here is just regular class definition stuff. i.e. fields, ctors, methods

    private String display;

    //constructor must be implicitly private
    Genre(String display){
        System.out.println("Genre constructor called");
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public String toString(){
        return getDisplay();
    }
}