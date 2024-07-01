class MovieClient {
    //Start of application
    public static void main(String[] args) {
        Movie m1 = new Movie();
        System.out.println(m1);
        System.out.println();

        Movie m2 = new Movie();
        m2.setTitle("Dune");
        m2.setReleaseYear(2021);
        m2.setRevenue(407_000_000.0);
        System.out.println(m2); //toString automatically called
        System.out.println();

        Movie m3 = new Movie("Finding Nemo", 2003, 940_000_000.0);
        System.out.println(m3);
        System.out.println();

        Movie m4 = new Movie("Adventures of Jay and DeShon");
        System.out.println(m4);
        System.out.println();
    }
}