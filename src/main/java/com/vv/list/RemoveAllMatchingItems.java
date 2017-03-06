package com.vv.list;

/**
 * Created by vasudvis on 1/25/2017.
 */
public class RemoveAllMatchingItems<T extends Comparable> extends LinkedList {

    public void removeAllMatchingItem(T item) {
        if (this.head == null) return;

        Node<T> temp = this.head;
        Node<T> prev = null;
        while(temp != null && temp.getData().equals(item) ){
            temp = temp.getNext();
        }
        this.head = temp;
        while (temp != null) {
            if (temp.getData().equals(item)) {
                prev.setNext(temp.getNext());
            } else {
                prev = temp;
            }
            temp = temp.getNext();
        }
    }


    public static void main(String[] args){
        RemoveAllMatchingItems<Integer> list = new RemoveAllMatchingItems();
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(4);

        list.showAll();
        System.out.println();
        list.removeAllMatchingItem(4);
        list.showAll();

    }
}
