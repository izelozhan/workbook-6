package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T>{
    List<T> items;
    int maxSize;

    FixedList(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void add(T item){
        if (items.size() < maxSize){
            items.add(item);
        } else {
            throw  new RuntimeException("Can not add your item: " + item + ". List has reached max size!");
        }
    }

    public List<T> getItems(){
        return items;
    }
}
