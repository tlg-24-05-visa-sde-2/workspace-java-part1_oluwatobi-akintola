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
        clock1.snoozeInterval = 7;

        //create a second alarm clock object and set snooze interval as well
        AlarmClock clock2 = new AlarmClock();
        clock2.snoozeInterval = 10;

        //create a 3rd alarm clock object but dont give a snoozeInterval
        AlarmClock clock3 = new AlarmClock();

        //make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

    }
}