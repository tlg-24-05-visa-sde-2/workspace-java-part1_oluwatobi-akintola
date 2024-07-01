//create 2 or 3 instances
class TurnTablesClient {
    public static void main(String[] args) {
        TurnTables t1 = new TurnTables("Tints - Anderson Paak (feat. Kendrick Lamar)", 100);
        t1.mixer = "Left";
        t1.load();
        t1.play();

        TurnTables t2 = new TurnTables("Floods - by Lucky Daye");
        t2.mixer = "right";
        t2.getBpm();
        t2.load();
        t2.play();
        t2.pause();

        TurnTables t3 = new TurnTables();
        t3.setSong("Mystery Lady - by Masego (feat. Don Toliver");
        t3.mixer = "right";
        t3.getBpm();
        t3.load();
        t3.play();
        t3.pause();

        System.out.println(t3.toString());
    }
}