package com.vv.list;
/**
 * Created by vasudvis on 1/25/2017.
 */

public class LinkedList<P extends Comparable> {
    Node<P> head;

    public LinkedList() {
    }

    public void showAll() {
        Node<P> tmp = this.head;
        while (tmp != null) {
            System.out.print(tmp.getData() + " -> ");
            tmp = tmp.getNext();
        }
    }

    public void addFirst(P data) {
        Node<P> first = new Node<P>(data, this.head);
        this.head = first;
    }

    public void addLast(P data) {
        if (this.head == null) {
            this.head = new Node<P>(data, null);
            return;
        }
        Node<P> node = this.head;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(new Node<P>(data, null));
    }

    public void removeFirst() {
        if (this.head == null) {
            return;
        }
        this.head = this.head.getNext();
    }

    public void remove(P data) {
        if (this.head == null) return;
        if (this.head.getData() == data) {
            this.head = null;
        }
        Node<P> prev = null;
        Node<P> temp = this.head;
        while (temp.getNext() != null && !temp.getData().equals(data)) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp.getData().equals(data)) {
            prev.setNext(temp.getNext());
            return;
        }
        if (temp.getNext() == null) {
            System.out.println("Element not found");
        }
    }




    public void reverse(){
        // very important
        if (this.head == null) return;

        Node<P> temp = this.head;
        Node<P> prev = null;
        Node<P> next = null;

        while(temp.getNext() != null){
            next = temp.getNext();
            temp.setNext(prev);
            prev = temp;
            temp = next;
        }
        temp.setNext(prev);
        this.head = temp;
    }


    public void removeLast() {
        Node<P> prev = null;
        Node<P> temp = this.head;
        while (temp.getNext() != null) {
            prev = temp;
            temp = temp.getNext();
        }
        prev.setNext(null);
    }

}
