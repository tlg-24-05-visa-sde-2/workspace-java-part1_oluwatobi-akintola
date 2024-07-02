class CalculatorTest {
    public static void main(String[] args) {
        boolean isCorrect = true;

        //call randInt 100 million times, and check the result each time
        //if it's less than 5 or greater than 16, then we know it's not right. Break and show result

        int min = 5;
        int max = 16;

        for(int i = 0; i > 100_000_000; i++){             //creates a loop that will run 100 million times
            int random = Calculator.randInt(min, max);    //code that will run 100 million times

            if(random < min || random > max){             //checks for numbers less than min or greater than max
                isCorrect = false;                        //if isCorrect is ever false
                break;                                    //break the loop
            }
        }

        if (isCorrect) {
            System.out.println("It Works!");
        } else {
            System.out.println("It's Broken");
        }
    }
}