package com.fasttrack.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alb Mihai", 30, "carpenter"));
        personList.add(new Person("Sandra Mircea", 34, "welder"));
        personList.add(new Person("Dume Florin", 40, "plumber"));
        personList.add(new Person("Popovici Mihai", 33, "carpenter"));
        personList.add(new Person("Popa Denis", 23, "plumber"));
        Company company = new Company(personList, "Popescu Andrei", 27);
        System.out.println(company);
        System.out.println((company.getManager()));
        System.out.println(company.getPersons("carpenter"));
        System.out.println(company.getPersonsOlder(31));
        System.out.println(company.getPerson("Mihai"));
        company.employ(new Person("Fodor Traian", 58, "manager"));
        System.out.println(company);


    }
}
