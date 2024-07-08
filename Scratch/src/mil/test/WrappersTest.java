package mil.test;

class WrappersTest {

    public static void main(String[] args) {
       String ageInput = "25";
       int age = Integer.parseInt(ageInput); //returns int 25
       Integer ageInteger = Integer.valueOf(ageInput); //returns integer 25 (object)

       String populationInput = "800000000";
       long population = Long.parseLong(populationInput);
       Long populationLong = Long.valueOf(populationInput);

       String priceInput = "12.49";
       double price = Double.parseDouble(priceInput);
       Double priceDouble = Double.valueOf(priceInput);

       String isSunnyInput = "true";
       boolean isSunny = Boolean.parseBoolean(isSunnyInput);
       Boolean isSunnyBoolean = Boolean.valueOf(isSunnyInput);
    }
}