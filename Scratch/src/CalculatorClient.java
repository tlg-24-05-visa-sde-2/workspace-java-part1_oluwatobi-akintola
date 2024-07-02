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

        System.out.println("The winner is " + Calculator.randInt());
    }
}