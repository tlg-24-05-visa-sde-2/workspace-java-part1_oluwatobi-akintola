/*
 *application or system class model the workings of a television
 * it has properties, attributes, business methods, but no main() method.
 */
class Television {
    //properties or attributes - fields/instance variables
    private String brand = "Toshiba";
    private int volume = 1;

    //constructors

    public Television() {
    }

    public Television(String brand){
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    //functions or operations - methods
    public void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " tv to volume " + getVolume()); //calls getters instead of
                                                                                              // original fields
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
        return "Your " + getBrand() + " tv's volume is " + getVolume();
    }
}