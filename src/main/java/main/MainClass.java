package main;

import implementations.LinkedListImpl;

import java.util.Stack;

public class MainClass {

    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addFirst(1);
        linkedList.addFirst(4);
        linkedList.addFirst(6);
        linkedList.addFirst(8);
        linkedList.addAtIndex(9,1);
        linkedList.display();
        System.out.println("------");
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.display();
    }
}
