package org.example;

public class Main {
    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo();
        StackDemo stack = new StackDemo();

        for(int i = 1; i<=3; i++){
            queue.add(i);
            stack.add(i);
        }

        System.out.println("Queue elements:");
        while (!queue.isEmpty()){
            System.out.println("Get element: " + queue.get());
            System.out.println("Next element: " + queue.next());
        }

        System.out.println("Stack elements:");
        while (!stack.isEmpty()){
            System.out.println("Get(first) element: " + stack.get());
            System.out.println("Next element: " + stack.next());
        }
    }
}