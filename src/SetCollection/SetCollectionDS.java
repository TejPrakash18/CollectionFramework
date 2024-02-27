package SetCollection;

import java.sql.Array;
import java.util.*;

public class SetCollectionDS {
    public static void main(String[] args) {
        Set<Integer> obj = new HashSet<>();
        obj.add(45);
        obj.add(22);
        obj.add(83);
        obj.add(21);
        System.out.println(obj);

        System.out.println(obj.hashCode());

        Set<Integer> obj1 = new HashSet<>();

        obj1.add(33);
        obj1.add(2);
        obj1.add(45);
        obj1.add(83);

        System.out.println(obj1);

        //set operations
//        System.out.println("set operations");
//        obj.addAll(obj1);
//        System.out.println("union "+obj);

//        Set<Integer> r = new HashSet<>();
//        r.addAll(obj1);
//        obj.retainAll(r);
//        System.out.println("Intersection "+r);

//        obj.containsAll(obj1);
//        System.out.println("subset "+obj);

        Iterator<Integer> it = obj.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        ArrayList<String> name = new ArrayList<>();
        name.add("kuchh bhi");
        name.add("hey");
        name.add("Hello");
        name.add("Prerna");
        System.out.println(name);


        LinkedHashSet<String> names = new LinkedHashSet<>(name);
        names.add("Annie");
        names.add("Kajal");
        names.add("gungan");
        names.add("Prerna");
        names.add("kuchh bhi");
        System.out.println("all names "+names);



        LinkedHashSet<String> addNames = new LinkedHashSet<>(name);
        System.out.println("Creating from the other collectoin"+addNames);

    }
}
