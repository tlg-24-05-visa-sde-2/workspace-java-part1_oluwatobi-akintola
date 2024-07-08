package com.people;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Tobi", LocalDate.of(1998, 6, 9));

        //print following: <name> is <age> years old
        System.out.printf("%s is %s years old\n", p1.name(), p1.age());
        System.out.println(p1);
    }
}