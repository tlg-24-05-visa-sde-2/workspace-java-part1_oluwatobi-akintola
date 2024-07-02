class TurnTable {
    //properties/attributes (limit to 5-6)

     private String song = "Happy Birthday";
     private int bpm = 75;
     String load;
     String play;
     String pause;
     String mixer;

     //Constructors
    public TurnTable() {
    }

    public TurnTable(String song) {
        setSong(song);
    }

    public TurnTable(String song, int bpm) {
        this(song);
        setBpm(bpm);
    }

    //functions or behaviors - methods
    //fill below then uncomment (at least 3)

    public void play(){
        System.out.println("Playing " + getSong() + " on " + mixer + " mixer at " + getBpm() + " BPM");
    }

    public void pause(){
        System.out.println("Pausing " + getSong() + " on " + mixer + " mixer");
    }

    public void bpm(){
        System.out.println(mixer + " mixer has been changed to " + getBpm() + " BPM");
    }

    public void load(){
        System.out.println("Loading " + getSong() + " on " + mixer + " mixer");
    }

    //Getter for song
    public String getSong() {
        return song;
    }

    //Setter for song
    public void setSong(String song) {
        this.song = song;
    }

    //Getter for bpm
    public int getBpm() {
        return bpm;
    }

    //Setter for bpm
    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public String toString(){
        return "Playing " + getSong() + " on " + mixer + " mixer at " + getBpm() + " BPM";
    }
}