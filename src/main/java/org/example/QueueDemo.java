package org.example;

import java.util.LinkedList;

public class QueueDemo {
    private LinkedList<Object> qlist = new LinkedList<>();

    public void add(Object element){
        qlist.addLast(element);
    }

    public Object next(){
        return qlist.removeFirst();
    }

    public Object get(){
        return qlist.getFirst();
    }

    public boolean isEmpty(){
        return qlist.isEmpty();
    }
}
