class TelevisionValidationTest {

    public static void main(String[] args) {
        //Volume/Brand validity tests
        Television tv1 = new Television();
        tv1.setVolume(1);
        tv1.setBrand("Toshiba");
        System.out.println(tv1);

        tv1.setVolume(100);
        tv1.setBrand("Sony");
        System.out.println(tv1);
        System.out.println("<------------------------------->");

        tv1.setVolume(0);
        System.out.println();

        tv1.setVolume(101);
        System.out.println();

        tv1.setBrand("Roku");
        System.out.println("Brand: " + tv1.getBrand());

        tv1.setBrand("Westinghouse");
        System.out.println("Brand: " + tv1.getBrand());
    }
}