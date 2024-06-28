//create 2 or 3 instances
class TurnTablesClient {
    public static void main(String[] args) {
        TurnTables t1 = new TurnTables();
        t1.song = "Tints - Anderson Paak (feat. Kendrick Lamar)";
        t1.bpm = 100;
        t1.mixer = "Left";
        t1.load();
        t1.play();

        TurnTables t2 = new TurnTables();
        t2.song = "Floods - by Lucky Daye";
        t2.mixer = "right";
        t2.bpm = 75;
        t2.load();
        t2.play();
        t2.pause();
    }
}