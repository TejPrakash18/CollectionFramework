package PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueImplemention {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Prerna");
        pq.add("Gungun");
        pq.add("Kajal");
        pq.add("Annie");
        pq.add("Neha");

        System.out.println(pq);
        System.out.println(pq.peek());
//        System.out.println(pq.element());
        System.out.println(pq.size());
        String name = pq.remove();
        System.out.println(name);
        System.out.println(pq);
        System.out.println(pq.contains("Neha"));

    }
}
