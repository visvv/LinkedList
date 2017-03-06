package com.vv.list;

/**
 * Created by vasudvis on 1/26/2017.
 */
public class MergeSortedLinkedLists<P extends Comparable> {

    public void mergeLinkedList(LinkedList<P> one, LinkedList<P> two){
        LinkedList<P> newList = new LinkedList<P>();
        Node<P> tmp_one = one.head;
        Node<P> tmp_two = two.head;

        while(tmp_one != null && tmp_two != null){
               if(!tmp_one.isGreaterThan(tmp_two)){
                   newList.addLast(tmp_one.getData());
                   tmp_one = tmp_one.getNext();
               }else{
                   newList.addLast(tmp_two.getData());
                   tmp_two = tmp_two.getNext();
               }
        }

        while(tmp_one!= null){
            newList.addLast(tmp_one.getData());
            tmp_one = tmp_one.getNext();
        }

        while(tmp_two != null){
            newList.addLast(tmp_two.getData());
            tmp_two = tmp_two.getNext();
        }

        newList.showAll();

    }

    public static void main(String[] args) {
        MergeSortedLinkedLists<Integer> list = new MergeSortedLinkedLists();
        LinkedList<Integer> list_one = new LinkedList();
        LinkedList<Integer> list_two = new LinkedList();

        list_one.addLast(1);
        list_one.addLast(2);
        list_one.addLast(3);
        list_one.addLast(7);
        list_one.addLast(8);

        list_two.addLast(4);
        list_two.addLast(5);
        list_two.addLast(6);
        list_two.addLast(9);

        list.mergeLinkedList(list_one, list_two);

    }
}
