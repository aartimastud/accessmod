package CollectionP;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        //HashSet
        Set s1 = new HashSet();
        Set<Integer> s2 = new HashSet<>();

        s1.add(10);
        s1.add(30);
        s1.add(20);
        s1.add(40);
        s1.add("Aarti");
        s1.add("Sneha");
        s1.add("Sneha");

        s2.add(10);
        s2.add(20);
        s2.add(30);

        System.out.println("Set element: " +s1);
        System.out.println("Equals: "+s1.equals(s2));
        System.out.println("contains: "+s1.contains(20));
        System.out.println("hashcode: "+s1.hashCode());
        System.out.println("is empty: " +s1.isEmpty());
        System.out.println("remove element: "+s1.remove("Aarti"));
        System.out.println("size of objct: "+s1.size());
        System.out.println(s1.addAll(s2));

//        Integer arr[] = (Integer[]) s1.toArray( new Integer[0]);
//        Arrays.sort(arr);
//        Set<Integer> sorted = new HashSet<>(Arrays.asList(arr));
//        System.out.println("Soried"+s1);

        Iterator i1 = s1.iterator();
        while (i1.hasNext()){
            System.out.println("Set item using hashset: "+i1.next());
        }

        //LinkedHashSet

        Set s5 = new LinkedHashSet();
        s5.add(20);
        s5.add(50);
        s5.add(40);
        s5.add(30);
        s5.add(15);
        System.out.println("Linked Hash set: "+s5);
        System.out.println(s5.contains(20));
        System.out.println(s5.hashCode());
        System.out.println(s5.isEmpty());
        System.out.println(s5.remove(20));
        System.out.println(s5.size());
        System.out.println(s5.toArray());
        System.out.println(s5.toString());

        //treeset
        Set<Integer> s3 = new TreeSet<>();
        s3.add(10);
        s3.add(30);
        s3.add(20);
        s3.add(20);
        s3.add(25);

        Set<Integer> s4 = new TreeSet<>();
        s4.add(80);
        s4.add(60);
        s4.add(70);
        s4.add(55);

        System.out.println(s3);
        System.out.println(s3.equals(s2));
        System.out.println(s3.contains(20));
        System.out.println(s3.hashCode());
        System.out.println(s3.isEmpty());
        System.out.println(s3.remove(25));
        System.out.println(s3.size());
        System.out.println(s3.toArray());
        System.out.println(s3.addAll(s4));
        System.out.println(s3.toString());

        Iterator i2 = s3.iterator();
        while (i2.hasNext()){
            System.out.println("Set item using hashset: "+i2.next());
        }

        s3.clear();
        System.out.println(s3);

    }
}
