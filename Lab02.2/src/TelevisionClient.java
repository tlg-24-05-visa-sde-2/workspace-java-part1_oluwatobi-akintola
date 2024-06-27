/*
 *application main() class
 * in the main method we will create a few tv objects and make them do stuff
 */
class TelevisionClient {

    public static void main(String[] args) {
        //create instance of tv and set properties
        Television tv1 = new Television();
        tv1.brand = "Samsung"; //default value when not specified
        tv1.volume = 32; //default value when not specified

        //creates second instance of tv and sets properties
        Television tv2 = new Television();
        tv2.brand = "Sony";
        tv2.volume = 50;

        //creates a 3rd tv obj but doesn't set properties
        Television tv3 = new Television();


        //turn both of them on
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();

        //turn them both off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
    }
}