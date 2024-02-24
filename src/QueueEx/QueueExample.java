package QueueEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queueObj = new LinkedList<>();
        queueObj.add(10);
        queueObj.add(20);
        queueObj.add(30);
        System.out.println(queueObj);

        queueObj.offer(3);
        System.out.println(queueObj);


        System.out.println(queueObj.element());
        System.out.println(queueObj.poll());
        System.out.println(queueObj);

    }
}
