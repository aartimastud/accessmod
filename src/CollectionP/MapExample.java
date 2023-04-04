package CollectionP;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(1, "Aarti");
        m1.put(3,"Yash");
        m1.put(5,"Svara");
        m1.put(4,"Adarsh");
        m1.put(2,"Vikas");

        Map<Integer,String> m2 = new HashMap<>();
        m2.put(3,"Radhika");
        m2.put(5,"Svara");
        m2.put(4,"Adarsh");
        m2.put(2,"Vikas");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.get(5));
        System.out.println(m1.equals(m2));
        System.out.println(m1.isEmpty());
        System.out.println(m1.size());
        System.out.println(m1.containsKey(2));
        System.out.println(m1.containsValue("Vikas"));
        System.out.println(m1.remove(4));
        System.out.println(m1.entrySet());
        System.out.println(m1.replace(3, "Jay"));
        System.out.println(m1.hashCode());
        System.out.println(m1.keySet());
        System.out.println(m1.values());


        for(int i=0; i < m1.size();i++){
            System.out.println("Map iteration for loop: "+m1.get(i));
        }

        Iterator i1 = m1.keySet().iterator();
        while (i1.hasNext()){
            System.out.println("Key set iterator: " +i1.next());
        }

        Iterator i2 = m1.entrySet().iterator();
        while (i2.hasNext()){
            System.out.println("value set iterator: "+i2.next());
        }

        m1.clear();
        System.out.println(m1);

        System.out.println(" ");
        //treemap
        Map<Integer,String> m3 = new TreeMap<>();

        m3.put(1, "Aarti");
        m3.put(3,"Yash");
        m3.put(5,"Svara");
        m3.put(4,"Adarsh");
        m3.put(2,"Vikas");

        Map<Integer,String> m4 = new HashMap<>();
        m4.put(3,"Radhika");
        m4.put(5,"Svara");
        m4.put(4,"Adarsh");
        m4.put(2,"Vikas");
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m3.get(5));
        System.out.println(m3.equals(m2));
        System.out.println(m3.isEmpty());
        System.out.println(m3.size());
        System.out.println(m3.containsKey(2));
        System.out.println(m3.containsValue("Vikas"));
        System.out.println(m3.remove(4));
        System.out.println(m3.entrySet());
        System.out.println(m3.replace(3, "Jay"));
        System.out.println(m3.hashCode());
        System.out.println(m3.keySet());
        System.out.println(m3.values());


        for(int i=0; i < m3.size();i++){
            System.out.println("Map iteration for loop: "+m3.get(i));
        }

        Iterator i3 = m3.keySet().iterator();
        while (i3.hasNext()){
            System.out.println("Key set iterator: " +i3.next());
        }

        Iterator i4 = m3.entrySet().iterator();
        while (i4.hasNext()){
            System.out.println("value set iterator: "+i4.next());
        }

        m3.clear();
        System.out.println(m3);

        System.out.println(" ");
        //linkedhashmap
        Map<Integer,String> m5 = new LinkedHashMap<>();

        m5.put(1, "Aarti");
        m5.put(3,"Yash");
        m5.put(5,"Svara");
        m5.put(4,"Adarsh");
        m5.put(2,"Vikas");

        Map<Integer,String> m6 = new HashMap<>();
        m6.put(3,"Radhika");
        m6.put(5,"Svara");
        m6.put(4,"Adarsh");
        m6.put(2,"Vikas");
        System.out.println(m5);
        System.out.println(m6);
        System.out.println(m5.get(5));
        System.out.println(m5.equals(m2));
        System.out.println(m5.isEmpty());
        System.out.println(m5.size());
        System.out.println(m5.containsKey(2));
        System.out.println(m5.containsValue("Vikas"));
        System.out.println(m5.remove(4));
        System.out.println(m5.entrySet());
        System.out.println(m5.replace(3, "Jay"));
        System.out.println(m5.hashCode());
        System.out.println(m5.keySet());
        System.out.println(m5.values());


        for(int i=0; i < m5.size();i++){
            System.out.println("Map iteration for loop: "+m5.get(i));
        }

        Iterator i5 = m5.keySet().iterator();
        while (i5.hasNext()){
            System.out.println("Key set iterator: " +i5.next());
        }

        Iterator i6 = m5.entrySet().iterator();
        while (i6.hasNext()){
            System.out.println("value set iterator: "+i6.next());
        }

        m3.clear();
        System.out.println(m6);
    }
}
