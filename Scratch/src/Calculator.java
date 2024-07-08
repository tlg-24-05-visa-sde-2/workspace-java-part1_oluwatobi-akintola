
/*
 * This is an all static class, i.e., it has nothing but static methods
 */

class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int v) {
        return v % 2 == 0;
    }

    //This method returns the average of the supplied integers
    //client can pass zero or more
    public static double average(int first, int... rest){  // 3, 4, 9, 2, 3 - FIRST is the "3", REST are the "4, 9, 2, 3"
        //Inside here rest is automatically an array of int[]
        int sum = first;

        for( int value : rest){   //for every number in the rest array
            sum = sum + value;      //since sum is 0, when iterating it will add each iteration to sum
        }

        return (double)sum / (rest.length + 1);
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

    public static int randBetween(int min, int max) {
        int result = 0;

        double rand = Math.random();
        double scaled = (rand * (max - min + 1));
        double lifted = scaled + min;
        result = (int) (lifted);

        return result;
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

    public static int randInt(int min, int max) {
        return(int)
                (Math.random() * (max - min + 1)) + min; //0.000 to 11.999, then add 5 (5.000 - 4.999)
                                                         //downcasting decimal (int) results in 1 - 12
    }


    //Returns a random integer between 1 and max (inclusive)

    public static int randomInt(int max){
        return randInt(1, max); //delegate to min-max version passing 1 and max
    }


    public static int randInt() {
          return randInt(1, 11);              //uses another method (method within a method)
//        int result = 0;
//
//        double rand = Math.random();        //0.0000 to 0.9999
//        double scaled = (rand * 11) + 1;    //1.0000 to 11.9999
//        result = (int) scaled;              //explicit downcast from double to int (takes a double: ex. 4.678 and makes it an int instead)
//
//        return result;
    }
}

//int + int == int
//int + long = long
//int + double = double
//long + double = double