package com.vv.list;

/**
 * Created by vasudvis on 1/25/2017.
 */
public class InsertInOrderList<T extends Comparable> extends LinkedList {

    public void inserInOrder(T item) {
        if (this.head == null) {
            this.head = new Node<T>(item, null);
            return;
        }
        if(this.head.getData().compareTo(item) != -1){
            this.head = new Node(item, this.head);
            return;
        }

        Node<T> temp = this.head;
        Node<T> prev = null;
        while (temp.getNext() != null) {
            if (temp.getData().compareTo(item) != -1) {
                prev.setNext(new Node<T>(item, temp));
                return;
            }
            prev = temp;
            temp = temp.getNext();
        }

        if (temp.getNext() == null) {
            temp.setNext(new Node<T>(item, null));
        }

    }

    public static void main(String[] args) {
        InsertInOrderList<Integer> list = new InsertInOrderList();
        list.inserInOrder(3);
        list.inserInOrder(2);
        list.inserInOrder(1);
        list.inserInOrder(5);
        list.inserInOrder(0);
        list.inserInOrder(15);

        list.showAll();
    }
}

