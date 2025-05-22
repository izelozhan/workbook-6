package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> crowd = new ArrayList<>();
        List<Person> matched = new ArrayList<>();

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

        System.out.println("Enter a name to search you can search with firstname or lastname: ");
        String searchInput = scanner.nextLine().trim().toLowerCase();


        for (Person p : crowd) {
            String firstName = p.getFirstName().trim().toLowerCase();
            String lastName = p.getLastName().trim().toLowerCase();

            if (firstName.equals(searchInput) || lastName.equals(searchInput)) {
                matched.add(p);
                System.out.println(p + "is added to your matched list!");
            }
        }

        if (matched.isEmpty()) {
            System.out.println("No matches found!");
        } else {
            System.out.println("Your matched list: ");
            for (Person p : matched) {
                System.out.println(p.firstName + " " + p.lastName);
            }
        }
        //calculate average orj list
        int totalAge = 0;
        int oldest = 0;
        int youngest = Integer.MAX_VALUE; // if we

        for (Person p : crowd){
            totalAge += p.getAge();

            if (p.getAge() > oldest){
                oldest = p.age;
            }
            if (p.getAge() < youngest){
                youngest = p.age;
            }

        }
        int average = totalAge / crowd.size();
        System.out.println("Average age is : " + average);

        System.out.println("Oldest age is : " + oldest);

        System.out.println("Youngest age is : " + youngest);
    }
}
