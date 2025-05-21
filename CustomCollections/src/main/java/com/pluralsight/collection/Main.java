package com.pluralsight.collection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);

        FixedList<LocalDate> dates = new FixedList<>(3);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());

        System.out.println(dates.getItems());
    }
}
