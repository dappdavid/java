package prep.playground;

import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {

        Map m1 = new HashMap<String, String>();
        Map m2 = new LinkedHashMap<String, String>();

        Set s1 = new HashSet<String>();
        Set s2 = new LinkedHashSet<String>();

        List l1 = new ArrayList<String>();
        List l2 = new LinkedList<String>();
        List l3 = new LinkedList<>();
        l3.add("S2");
        l3.add(67);
//        System.out.println(l3);

        //final list can be modified but can't be reassigned
        final List l4 = new LinkedList<String>();
        l4.add("1");
        l4.add("2");
//        System.out.println(l4);
       // l4 = l3; //Compilation error
        l3 = l4; //no compilation error

        //Collections class
        Collections.unmodifiableList(l1);
        Collections.unmodifiableMap(m1);
        Collections.unmodifiableSet(s1);
        Collections.unmodifiableCollection(l1);

        Collections.synchronizedList(l1);
        Collections.synchronizedMap(m1);
        Collections.synchronizedSet(s1);
        Collections.synchronizedCollection(l1);

        Collections.sort(l1);


        calculate(45, true, "abc");
    }

    //Generic method
    public static <T> void calculate(T var1){
        System.out.println("var1 : "+var1);
    }

    //Generic method with multiple generic args
    public static <A, B, C> void calculate(A var1, B var2, C var3){
        System.out.println("var1 : "+var1);
        System.out.println("var2 : "+var2);
        System.out.println("var3 : "+var3);
    }
}
