package org.snooze;

/*
 * Client-side "main-class", i.e.. The class definition with main().
 * That's the ONLY tHING IN HERE
 * we will create a few alarm clock objects and give them do stuff
 */
class AlarmClockClient {

    //entry point for every standalone java application
    public static void main(String[] args) {
        //create an instance of AlarmClock and set its snoozeInterval
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7); //explicit snoozeInterval

        //create a second alarm clock object and set snooze interval as well
        AlarmClock clock2 = new AlarmClock(10); //snoozeInterval

        //create a 3rd alarm clock object want snoozeInterval to be the longest
        AlarmClock clock3 = new AlarmClock(AlarmClock.MAX_INTERVAL); //using the static fixed max interval instance variable by calling AlarmClock.(dot)MAX_INTERVAL

        //make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        //show their toString() methods in action
        System.out.println(clock1.toString());
        System.out.println(clock2); //toString() automatically called
        System.out.println(clock3);
    }
}