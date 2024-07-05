import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 57;
        ages[1] = 51;
        ages[2] = 10;
        ages[3] = 10;
        System.out.println(Arrays.toString(ages)); //nicely formatted version due to the use of "Array.toString()"
        System.out.println();

        double[] temps = {90.3, 75.5, 112.7, 81.8, 86.0};
        System.out.println(Arrays.toString(temps));
        System.out.println();

        for(double temp : temps){
            System.out.println("temp is " + temp);
        }
        System.out.println();

        String[] cities = {"Seattle", "Austin", "Atlanta", "DC"};
        System.out.println("there are " + cities.length + " cities in the array");
        for(String city : cities){
            System.out.println("I live in " + city);
        }
        System.out.println();

        for(int i = 0; i < cities.length; i++){
            System.out.println("I live in " + cities[i]);
        }
    }
}