package com.trax.test;

import com.trax.TurnTable;

class TurnTableValidationTest {

    public static void main(String[] args) {
        TurnTable t1 = new TurnTable("Alright - by Kendrick Lamar");
        t1.setBpm(150);
        System.out.println(t1);

        t1.setBpm(70);
        System.out.println(t1);
        System.out.println("<--------------------------------------------------->");

        t1.setBpm(151);
        System.out.println(t1);
        System.out.println();

        t1.setBpm(69);
        System.out.println(t1);
    }
}