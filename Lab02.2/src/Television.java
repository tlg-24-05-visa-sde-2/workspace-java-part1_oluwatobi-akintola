import java.lang.reflect.Array;
import java.util.Arrays;

/*
 *application or system class model the workings of a television
 * it has properties, attributes, business methods, but no main() method.
 */
class Television {
    //all static fields go up here
    public static int instanceCount = 0;
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 1;

    //Disclaimer: Proper way would be to use a brand enum
    //Will do it this way for labs just for practice w/arrays and loops
    public static final String[] VALID_BRANDS = {"Sony", "LG", "Samsung", "Toshiba"};

    //Static getters/setters
    public static int getInstanceCount(){
        return instanceCount;
    }

    //Recall: all static methods are called as Television.methodName()
    //In this case, that means Television.isValidBrand()
    public static boolean isValidBrand(String brand){
        boolean valid = false;

        for (String validBrand : VALID_BRANDS) {
            if (validBrand.equals(brand)) {             //we have a match!
                valid = true;
                break;                                  //no need to keep looking
            }
        }

        return valid;
    }
    //-------------------------------------------------------------------
    //properties or attributes - fields/instance variables
    private String brand = "Toshiba";
    private int volume = 1;
    private DisplayType display = DisplayType.LED;

    //constructors

    public Television() {
        instanceCount++; //instanceCount + 1
    }

    public Television(String brand){
        this();       //delegate to the constructor above
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);  //delegate to the constructor above
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
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

    //Field Getters/Setters
    //Getter for brand
    public String getBrand() {
        return brand;
    }

    //Setter for brand
    public void setBrand(String brand) {
        if(isValidBrand(brand)){                  //Delegates to the isValidBrand method
            this.brand = brand;
        } else {
            System.out.println("Invalid brand: " + brand + ". Valid brands are " + Arrays.toString(VALID_BRANDS));
        }
    }

    //Getter for volume
    public int getVolume() {
        return volume;
    }

    //Setter for volume
    public void setVolume(int volume) {
        if(volume < MIN_VOLUME || volume > MAX_VOLUME){
            System.out.printf("Invalid volume: %s. Valid range is %s to %s (inclusive)",
                    volume, MIN_VOLUME, MAX_VOLUME);

//                    System.out.println(volume + " is an invalid volume number, please pick a volume number between "
//                    + MIN_VOLUME + ", and " + MAX_VOLUME);
        } else {
            this.volume = volume;
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private boolean verifyInternetConnection(){
        return true; //placeholder
    }

    //method to take the values in an instance of television and return a string using said values
    public String toString(){

        return String.format("Your %s tv's volume is %s. You have a %s display.", getBrand(), getVolume(), getDisplay());

//        return "Your " + getBrand() + " tv's volume is " + getVolume() + ". You have a " + getDisplay() + " display";
    }
}