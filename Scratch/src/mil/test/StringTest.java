package mil.test;

class StringTest {
    public static void main(String[] args) {
        String city1 = "new york";
        String city2 = "new york";

        System.out.println(city1 == city2);      //incorrect way to compare strings
        System.out.println(city1.equals(city2)); //correct way to compare strings
        System.out.println();

        String city1new = city1.substring(0, 3); //returns "new"
        String city2new = city2.substring(0, 3); //returns "new"

        System.out.println(city1new == city2new);//this is wrong, will return false
        System.out.println(city1new.equals(city2new));//this is the correct way to do it, the ONLY way to do it
        System.out.println();

        //in WA state license plates are like "637yoc"
        String pattern = "\\d{3}[A-Z]{3}|[A-Z]{3}\\d{4}|\\d{3}[a-z]{3}";
        String plate1 = "637YOC";
        String plate2 = "AAS1124";
        String plate3 = "637yoc";

        System.out.println(plate1.matches(pattern));
        System.out.println(plate2.matches(pattern));
        System.out.println(plate3.matches(pattern));
        System.out.println();

        String poem = """
                Roses are red
                Violets are blue
                Sugar is sweet
                and so are you
                """;
        System.out.println(poem);
    }
}