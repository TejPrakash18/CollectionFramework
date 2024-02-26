package LinkedList;

import java.util.*;

public class DLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(23);
        ll.add(12);
        ll.add(11);
        ll.add(14);
        System.out.println(ll);

        System.out.println(ll.get(3));
//
        ll.add(1,13);
        System.out.println(ll);
//
        ll.set(1, 14);
        System.out.println(ll);
//
        int res = ll.lastIndexOf(14);
        int res1 = ll.lastIndexOf(11);
        System.out.println("res 1 = "+res1);
        System.out.println("res "+res);

//
        int ress = ll.indexOf(14);
        System.out.println(ress);

//
        Iterator<Integer> it = ll.iterator();
        while(it.hasNext()){
            System.out.println("values "+ it.next());
        }
//
//
        for(int element : ll){
            System.out.println(element);
        }

//
        ll.remove(1 );
        System.out.println(ll);

        Queue<String> QLL = new LinkedList<>();

        Deque<Integer> Dll = new LinkedList<>();

        List<String> LLL = new LinkedList<>();
    }
}
