package Vector;

import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<String> vc = new Vector<>();
        vc.add("Prerna");
        vc.add("Annie");
        vc.add("Gungan");
        vc.add("Kajal");
        System.out.println(vc);

        vc.add(1,"Kanha");
        System.out.println(vc);

        Vector<String> vc1 = new Vector<>();
        vc1.add("TP");
        vc1.addAll(vc);
        System.out.println(vc1);

        //Remove Methods

        vc.remove("Gungan");
        System.out.println(vc);

        System.out.println(vc.size());
        System.out.println(vc.contains("Kanha"));

    }
}
