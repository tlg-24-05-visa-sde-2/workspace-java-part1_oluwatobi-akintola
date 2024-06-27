/*
 * Application class models the workings of an AlarmClock
 * This class will not have a main() method, most such classes do not
 */
class AlarmClock {
    //Properties or attributes - These are called "instance variables" or "fields" in java
    int snoozeInterval = 5; //default value when client doesnt specify

    //Functions or operations - these are called "methods" in java
    void snooze() {
        System.out.println("Snoozing for " + snoozeInterval + " minutes");
    }
}