package com.vv.list;

/**
 * Created by vasudvis on 1/25/2017.
 */
public class FindMiddle<P extends Comparable> extends LinkedList {
    public P findMiddle() {

        Node<P > first = this.head;
        Node<P> sec = this.head;
        while (first != null && first.getNext() != null) {
            sec = sec.getNext();
            first = first.getNext().getNext();
        }

        if (sec == this.head) {
            throw new RuntimeException("Middle element not found");
        }
        return sec.getData();
    }


    public static void main(String[] args){
        FindMiddle<Integer> list = new FindMiddle();
        list.addFirst(12);
        list.addFirst(13);
        list.addFirst(14);
        list.addFirst(15);
        list.reverse();
        list.showAll();
        System.out.println("Middle : " + list.findMiddle());
    }
}
