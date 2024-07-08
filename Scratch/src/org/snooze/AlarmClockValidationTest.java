package org.snooze;

//Client-side main class focused only on testing setSnoozeInterval()
//we will do BVT - boundary value testing
//any bugs will most likely be sniffed out at the edges of the valid range
//we will test 0,1 and 20, 21
//we will test each boundary
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(1); //value should be taken w/no errors
        System.out.println(clock1);
        System.out.println("-------------------------------");

        clock1.setSnoozeInterval(20); //value should be taken w/no errors
        System.out.println(clock1);
        System.out.println("-------------------------------");

        clock1.setSnoozeInterval(0); //error message value rejected
        System.out.println(clock1);
        System.out.println("-------------------------------");

        clock1.setSnoozeInterval(21); //error message value rejected
        System.out.println(clock1);
    }
}