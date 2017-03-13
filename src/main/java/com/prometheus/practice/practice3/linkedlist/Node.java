package main.java.com.prometheus.practice.practice3.linkedlist;

/**
 * Created by Dmitrik on 08.03.2017.
 */
public class Node {
    private Node next;
    private Integer data;

    public Node() {
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
    public void displayLink(){
        System.out.println("{ " + data + " }");
    }
}
