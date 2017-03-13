package main.java.com.prometheus.practice.practice3.linkedlist;

/**
 * Created by Dmitrik on 09.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.displayList();
        System.out.println(list.size());
        list.delete(0);
        list.displayList();
        System.out.println(list.size());
        System.out.println(list.get(3));


      /*  while (!list.isEmpty()){
            list.deleteFirst();
            System.out.print("Deleted ");
            list.displayList();
            System.out.println("");
        }
        list.displayList();
*/
    }
}
