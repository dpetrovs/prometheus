package main.java.com.prometheus.practice.practice3.linkedlist;

/**
 * Created by Dmitrik on 08.03.2017.
 */
public class LinkedList {
    Node head;
    Node tail;

    /* Конструктор без аргументів */
    public LinkedList() {

    }

    /* Додати елемент в кінець списку */
    public void add(Integer data) {
        Node newNode = new Node();
        newNode.setData(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /* Отримати елемент по індексу, повертає null якщо такий елемент недоступний */
    public Integer get(int index) {
        Node current = head;
        int i = 0;
        while (i != index) {
            if (current.getNext() == null) {
                return null;
            } else {
                current = current.getNext();
                i++;
            }
        }
        return current.getData();
    }

    /* Вилучення елементу за індексом, повертає true у разі успіху або false в іншому випадку */
    public boolean delete(int index) {
        Node current = head;
        Node previous = head;
        int i = 0;

        while (i != index) {
            if (current.getNext() == null) {
                return false;
            } else {
                previous = current;
                current = current.getNext();
                i++;
            }
        }

        if (current == head) {
           head = head.getNext();
        } else {
            previous.setNext(current.getNext());
        }

        return true;
    }

    /*Поверта розмір списку: якщо елементів в списку нема то повертає 0 (нуль)*/
    public int size() {
        Node current = head;
        int i = 0;
        while ( current != null) {
            current = current.getNext();
            i++;
        }
        return i;
    }

    public void displayList(){
        System.out.println("List (first-->last): ");
        Node current = head;
        while (current != null){
            current.displayLink();
            current = current.getNext();
        }
        System.out.println("");
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public Node deleteFirst(){
        Node temp = head;
        head = head.getNext();
        return temp;
    }

}
