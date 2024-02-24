package ArrayListPackage;

import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(4);
//        System.out.println(myList);
        myList.add(5);
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add(20);
        myList.add(10);
        myList.add(11);
        System.out.println(myList);
        myList.remove(2);
        System.out.println(myList);

        ArrayList<String> names = new ArrayList<>();
        names.add("Gungun");
        names.add("Prerna");
        names.add("kajal");
        names.add("Annie");

        System.out.println(names);
        names.remove("Prerna");
//        names.remove(1);
        System.out.println(names);
        names.set(0, "Prerna");
        names.add("kajal");
        System.out.println(names);

        System.out.println(names.get(2));
        System.out.println("\n\n");
        for (int i=0; i<names.size(); i++){
            System.out.println(names.get(i)+" "+i);
        }
    }
}
