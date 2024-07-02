//create 2 or 3 instances
class TurnTableClient {
    public static void main(String[] args) {
        TurnTable t1 = new TurnTable("Tints - Anderson Paak (feat. Kendrick Lamar)", 100);
        t1.mixer = "left";
        t1.load();
        t1.play();

        TurnTable t2 = new TurnTable("Floods - by Lucky Daye");
        t2.mixer = "right";
        t2.getBpm();
        t2.load();
        t2.play();
        t2.pause();

        TurnTable t3 = new TurnTable();
        t3.setSong("Mystery Lady - by Masego (feat. Don Toliver");
        t3.mixer = "right";
        t3.getBpm();
        t3.load();
        t3.play();
        t3.pause();

        System.out.println(t3.toString());
    }
}