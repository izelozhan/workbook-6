package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> crowd = new ArrayList<>();

        crowd.add(new Person("Emma", "Johnson", 25));
        crowd.add(new Person("Liam", "Smith", 24));
        crowd.add(new Person("Olivia", "Brown", 47));
        crowd.add(new Person("Ava", "Miller", 35));
        crowd.add(new Person("Lucas", "Taylor", 21));
        crowd.add(new Person("Sophia", "Anderson", 31));
        crowd.add(new Person("Mason", "Thomas", 20));
        crowd.add(new Person("Noah", "Davis", 28));
        crowd.add(new Person("Elijah", "Wilson", 60));
        crowd.add(new Person("Isabella", "Moore", 70));

        System.out.println("Enter a name to search you can search with first-name or last-name: ");
        String searchInput = scanner.nextLine().trim().toLowerCase();

        //steam version
        List<Person> match = crowd.stream().filter(p -> p.getFirstName().trim().equalsIgnoreCase(searchInput) || p.getLastName().trim().equalsIgnoreCase(searchInput)).toList();

        //print message
        if (match.isEmpty()) {
            System.out.println("No matches found!");
        } else {
            System.out.println("Your matched list: ");
            for (Person p : match) {
                System.out.println(p.firstName + " " + p.lastName);
            }
        }

        //calculate average orj list
        int totalAge = crowd.stream().map(Person::getAge).reduce(0, (a, b) -> a + b);
        int average = totalAge / crowd.size();
        int oldest = crowd.stream().map(Person::getAge).reduce(0, Integer::max);
        int youngest = crowd.stream().map(Person::getAge).reduce(Integer.MAX_VALUE, Integer::min);


        System.out.println("Average age is : " + average);

        System.out.println("Oldest age is : " + oldest);

        System.out.println("Youngest age is : " + youngest);
    }
}
