package com.vv.list;

/**
 * Created by vasudvis on 1/25/2017.
 */
public class PairwiseSwap<T extends Comparable> extends LinkedList {

    public void pairSwap(){
        Node<T> temp = this.head;
        Node<T> first = null;
        Node<T> second = null;
        Node<T> prev = null;
        Node<T> next = null;

        while(temp != null && temp.getNext() != null){
            first = temp;
            second = temp.getNext();
            next = second.getNext();
            if(prev != null){
                prev.setNext(second);
            }else{
                this.head = second;
            }
            second.setNext(first);
            first.setNext(next);
            prev = first;
            temp = next;
        }
    }

    public static void main(String[] args) {
        PairwiseSwap<Integer> list = new PairwiseSwap();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        //list.addLast(4);

        list.showAll();
        System.out.println();
        list.pairSwap();
        list.showAll();

    }
}
