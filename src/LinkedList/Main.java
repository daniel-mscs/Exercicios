package LinkedList;

import java.util.*;

public class Main {
    static void main(String[] args) {

        System.out.println("=== Array list ===");

        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("=== LinkedList ===");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Naruto");
        linkedList.add("Sasuke");
        linkedList.add("Sakura");

        System.out.println(linkedList);

        linkedList.add(1,"Kakashi");

        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        System.out.println("=== Stack ===");
        Stack<String> stack = new Stack<>();


        System.out.println("=== QUEUE ===");
        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        linkedList.add("Naruto");
        System.out.println(linkedList);

















    }
}
