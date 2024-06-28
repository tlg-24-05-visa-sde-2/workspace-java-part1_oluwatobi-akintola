class CalculatorClient {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        //Assigned to local variable then printed using variable
        double sum = calc.add(1.2, 3.5);
        System.out.println("The sum is "  + sum);

        //Method inline - all in one line (no variable assignment)
        System.out.println("Difference is " + calc.subtract(1.1, 3.1));

        //inline
        System.out.println("Is 10 even? " + calc.isEven(10));

        //assigned to local variable then printed using variable
        boolean evenNum = calc.isEven(10);
        System.out.println("Is the number even " + evenNum);

        System.out.println("The winner is " + calc.randInt());
    }
}