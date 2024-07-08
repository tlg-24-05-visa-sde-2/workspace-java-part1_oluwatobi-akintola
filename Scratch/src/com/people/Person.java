package com.people;

import java.time.LocalDate;
import java.time.Period;

//An immutable class
//That is, a class definition written in such a way that an instance of it (person objects)
//once created, cannot have their properties changed
//only getters/no setters
class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    //Returns the persons age in whole years
    //This is the period of time between the birthdate and today's date
    //This is a derived property i.e. its is calculated from existing data, not a new field
    public int age(){
        return Period.between(birthDate(), LocalDate.now()).getYears();
    }

    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public String toString(){
        return String.format("Person: name = %s birthDate = %s", name(), birthDate());
    }
}