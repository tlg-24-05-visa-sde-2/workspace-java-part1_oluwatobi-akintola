class TurnTables {
    //properties/attributes (limit to 5-6)
    //fill below then uncomment

     String load;
     int bpm = 75;
     String play;
     String pause;
     String mixer;
     String song = "Happy Birthday";

    //functions or behaviors - methods
    //fill below then uncomment (at least 3)

    void play(){
        System.out.println("Playing " + song + " on " + mixer + " mixer at " + bpm + " BPM");
    }

    void pause(){
        System.out.println("Pausing " + song + " on " + mixer + " mixer");
    }

    void bpm(){
        System.out.println(mixer + " mixer has been changed to " + bpm + " BPM");
    }

    void load(){
        System.out.println("Loading " + song + " on " + mixer + " mixer");
    }
}