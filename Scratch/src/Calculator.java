class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    boolean isEven(int v) {
        return v % 2 == 0;
    }

    //returns a random integer between min and max (inclusive)
    /*
     * return type: int
     * method name examples:
     *  random()
     *  numberGenerator()
     *  randomInt()
     *  randBetween()
     * TODO: implement this algorithm
     */

    int randBetween(int min, int max) {
        return  0;
    }

    /*
     * Returns a random integer between one(1) and eleven(11) (inclusive)
     *
     * HINT: see a class called Math, look for a helpful method here
     * NOTE: these are "static" which means you call them like this - Math.methodName()
     *
     * int for return type
     * example names:
     * randomInt()
     * randInt()
     * randomNum()
     */

    int randInt() {
        int result = 0;

        double rand = Math.random();        //0.0000 to 0.9999
        double scaled = (rand * 11) + 1;    //1.0000 to 11.9999
        result = (int) scaled;              //explicit downcast from double to int

        return result;
    }
}

//int + int == int
//int + long = long
//int + double = double
//long + double = double