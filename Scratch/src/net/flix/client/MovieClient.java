package net.flix.client;

import net.flix.Genre;
import net.flix.Movie;
import net.flix.Rating;

class MovieClient {
    //Start of application
    public static void main(String[] args) {
        Movie m1 = new Movie("Dune");
        m1.setReleaseYear(2021);
        m1.setRevenue(407_000_000.0);
        m1.setRating(Rating.PG_13);
        m1.setGenre(Genre.SCI_FI);
        System.out.println(m1); //toString automatically called
        System.out.println();

        Movie m2 = new Movie("Finding Nemo", 2003, 940_000_000.0, Rating.G, Genre.ANIME);
        System.out.println(m2);
        System.out.println();

        Movie m3 = new Movie("Adventures of Jay and DeShon", Genre.MYSTERY);
        System.out.println(m3);
        System.out.println();
    }
}