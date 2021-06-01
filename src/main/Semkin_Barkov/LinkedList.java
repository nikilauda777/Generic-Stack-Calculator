package Semkin_Barkov;

import assignment3_int.GenericStack;

public class LinkedList<E> implements GenericStack<E> {

    private Node head;
    private Node tail;


    public LinkedList() {
        head = null;
        tail = null;
    }


    @Override
    public void push(E element) { // LIFO

        if (head == null || head.data == null) {   // wenn es kein Element gibt im header , hinzufügen
            head = new Node(element);
            tail = null;
        } else {
            Node n = head;
            while (n.next != null) {        // move so long to the next
                n = n.next;
            }
            n.next = new Node(element);    // zum Schluss hinzufügen
            tail = n.next;                   // Tail is last element
            tail.next = null;
        }
    }

    @Override
    public E lastElement() {

        if (head == null) {                         //head null
            return null;
        }
        if(head.next == null){                      //next after head
            return head.data;
        }
        if(head == tail){                           // tail and head the same
            return head.data;
        }
        Node last = head;

        while (last.next != tail) {                // go to next so long is it not tail

            last = last.next;
        }

        E l = tail.data;                            // l = tail
        tail = last;                                // zeiger auf das vorherige
        tail.next = null;                           //letzte wird gelöscht

        return l;
    }

    @Override
    public E pop() {                    //returns the top item of this stack and removes it
        if (head == null)
            return null;

        E d = head.data;
        head = head.next;
        return d;
    }

    @Override                           //returns the top item of this stack without removing it
    public E peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }




    private class Node {

        E data;
        Node next;

        Node(E d) {
            data = d;
            next = null;
        }
    }

}