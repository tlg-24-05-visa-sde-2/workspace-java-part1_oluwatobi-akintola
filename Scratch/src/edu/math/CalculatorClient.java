package edu.math;

class CalculatorClient {
    public static void main(String[] args) {
        //Assigned to local variable then printed using variable
        double sum = Calculator.add(1.2, 3.5);
        System.out.println("The sum is "  + sum);

        //Method inline - all in one line (no variable assignment)
        System.out.println("Difference is " + Calculator.subtract(1.1, 3.1));

        //inline
        System.out.println("Is 10 even? " + Calculator.isEven(10));

        //assigned to local variable then printed using variable
        boolean evenNum = Calculator.isEven(10);
        System.out.println("Is the number even " + evenNum);

        System.out.println("The winner is " + Calculator.randInt(5, 16)); //min-max version

        System.out.println();

        System.out.println("Average is: " + Calculator.average(3, 4, 9, 2, 3)); //convenient

        System.out.println("Average of a single nu,ber is: " + Calculator.average(12));
    }
}