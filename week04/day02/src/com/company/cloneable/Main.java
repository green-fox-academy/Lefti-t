package com.company.cloneable;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException  {


        ArrayList<Person> people = new ArrayList<>();


        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponsor sponsor = new Sponsor();
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);


        Student Lefti = new Student("Lefti", 35, "male","GFA");
        try {
            Student johnTheClone = (Student) Lefti.clone();
            people.add(johnTheClone);
        }catch (CloneNotSupportedException c){}


            Lefti.introduce();

            student.skipDays(3);

            for (int i = 0; i < 5; i++) {
                elon.hire();
            }

            for (int i = 0; i < 3; i++) {
                sponsor.hire();
            }

            for (Person person : people) {
                person.introduce();
                person.getGoal();
            }

            Cohort awesome = new Cohort("AWESOME");
            awesome.addStudent(student);
            awesome.addStudent(john);
            awesome.addMentor(mentor);
            awesome.addMentor(gandhi);

            awesome.info();

        }
    }

