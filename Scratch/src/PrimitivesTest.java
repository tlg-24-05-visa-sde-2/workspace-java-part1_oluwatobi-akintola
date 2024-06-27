class PrimitivesTest {

    public static void main(String[] args) {
        int age = 25;
        System.out.println("age is: " + age);

        long population = 8_000_000_000L;
        System.out.println("population is: " + population);

        double price = 799.99;
        System.out.println("price is: " + price);

        boolean isCloudy = false;
        System.out.println("isCloudy is: " + isCloudy);

        char size = 'S';
        System.out.println("size is: " + size);

        String grade = "A";
        System.out.println("my grade on the tests was: " + grade);

        String quote = "whats up \"doc\"?";
        System.out.println("bugs bunny says " + quote);

        String poem = "roses are red\nviolets are blue"; // \n splits into separate lines "new line"
        System.out.println(poem);
        System.out.println();

        int n = 18;
        int m = n; //a separate instance of 18

        n = 19;
        System.out.println("n is: " + n); //should say 19
        System.out.println("m is: " + m); //still 18
        System.out.println();

        int kids = 2;
//        kids++; //post increment operator
//        ++kids; //pre increment operator
        System.out.println("number of kids: " + kids++); //prints first THEN increments but does not show updated "kids"
        System.out.println("number of kids: " + ++kids); //increments THEN prints"
    }
}