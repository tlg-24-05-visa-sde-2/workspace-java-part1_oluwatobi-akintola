/*
 *application or system class model the workings of a television
 * it has properties, attributes, business methods, but no main() method.
 */
class Television {
    //properties or attributes - fields/instance variables
    private String brand = "Toshiba";
    private int volume = 1;

    //functions or operations - methods
    public void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + brand + " tv to volume " + volume);
    }

    public void turnOff(){
        System.out.println("Shutting down...goodbye");
    }

    //Getter for brand
    public String getBrand() {
        return brand;
    }

    //Setter for brand
    public void setBrand(String brand) {
        this.brand = brand; //"this" refers to whatever is passed into the () of the setBrand() method
    }

    //Getter for volume
    public int getVolume() {
        return volume;
    }

    //Setter for volume
    public void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean verifyInternetConnection(){
        return true; //placeholder
    }

    //method to take the values in an instance of television and return a string using said values
    public String toString(){
        return "Your " + brand + " tv's volume is " + volume;
    }
}