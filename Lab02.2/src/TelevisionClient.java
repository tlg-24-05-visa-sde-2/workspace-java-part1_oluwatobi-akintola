/*
 *application main() class
 * in the main method we will create a few tv objects and make them do stuff
 */
class TelevisionClient {

    public static void main(String[] args) {
        //create instance of tv and set properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");   //sets the brand of the television using the setter method
        tv1.setVolume(Television.MIN_VOLUME);
        tv1.setDisplay(DisplayType.PLASMA);

        //creates second instance of tv and sets properties
        Television tv2 = new Television("Sony", Television.MAX_VOLUME, DisplayType.OLED);

        //creates a 3rd tv obj but doesn't set properties
        Television tv3 = new Television("LG");
        System.out.println();


        //turn both of them on
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        System.out.println();

        //turn them both off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
        System.out.println();

        //Print toString for tv1
        System.out.println(tv1.toString());
        System.out.println(tv2);
        System.out.println(tv3);
        System.out.println();

        //Prints number of instances created
        System.out.println("Number of instances " + Television.getInstanceCount());
    }
}