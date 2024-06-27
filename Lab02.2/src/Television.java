/*
 *application or system class model the workings of a television
 * it has properties, attributes, business methods, but no main() method.
 */
class Television {
    //properties or attributes - fields/instance variables
    String brand = "Toshiba";
    int volume = 1;

    //functions or operations - methods
    void turnOn(){
        System.out.println("Turning on your " + brand + " tv to volume " + volume);
    }

    void turnOff(){
        System.out.println("Shutting down...goodbye");
    }
}