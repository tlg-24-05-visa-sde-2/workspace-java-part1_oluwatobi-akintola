/*
 * Application class models the workings of an AlarmClock
 * This class will not have a main() method, most such classes do not
 */
class AlarmClock {
    //static fields, one copy shared amongst all instances
    //anything up here is referenced useing the class name i.e. AlarmClock.(dot)
    //they are called "class constants"
    //closest thing to "global variables"
    //naming convention: ALL_CAPS_AND_UNDERSCORES
    public static final int MIN_INTERVAL = 1;  //"shared" variables because of "static" (one copy)
    public static final int MAX_INTERVAL = 20; //"final" means "fixed",and cannot change it

    //Properties or attributes - These are called "instance variables" or "fields" in java
    private int snoozeInterval = 5; //default value when client doesnt specify

    //default/no argument constructor (added manually)
    public AlarmClock(){
    }

    //constructors (every class MUST have at least ONE constructor, if no constructor is present then one will be inserted at compile time)
    //if you ADD a constructor the one added will be prioritized (the "default" on will not be inserted at compile time)
    //if you want the default one but already have a constructor then you have to manually add it yourself
    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);
    }

    //Functions or operations - these are called "methods" in java
    public void snooze() {
        System.out.println("Snoozing for " + snoozeInterval + " minutes");
    }

    //accessor method: provide controlled access to the object's fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    //business data constraint - must be between 1 - 20 (inclusive)
    //if incoming value is "valid" (between 1 - 20), assign to the field
    //otherwise reject it with a message
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) { //valid input
            this.snoozeInterval = snoozeInterval;
        } else {
            System.out.println("Invalid snooze interval: " + snoozeInterval + ". Must be between " + MIN_INTERVAL
                    + ",and " + MAX_INTERVAL + " (inclusive).");
        }

    }

    //purpose: return a string describing this object
    public String toString(){
        return "AlarmClock: snoozeInterval = " + snoozeInterval;
    }
}