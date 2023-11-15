package org.example;

import java.util.LinkedList;

public class StackDemo {
    private LinkedList<Object> sList = new LinkedList<>();

    public void add(Object element){
        sList.addFirst(element);
    }

    public Object get(){
        return sList.getFirst();
    }

    public Object next(){
        return sList.removeFirst();
    }

    public boolean isEmpty(){
        return sList.isEmpty();
    }
}
