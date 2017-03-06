package com.vv.list;

/**
 * Created by vasudvis on 1/25/2017.
 */
class Node<T extends Comparable> {
    T data;
    Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public boolean isGreaterThan(Node<T> node){
        if(this.data.compareTo(node.getData()) ==1){
            return true;
        }else
            return false;
    }
}
