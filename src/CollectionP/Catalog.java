package CollectionP;

import java.util.*;

public class Catalog {
    private Map<String, Set<String>> aCatalog;

    public Catalog(){
        aCatalog = new HashMap<String, Set<String>>();
    }

    public Catalog(Map<String, Set<String>> catalog){
        this.aCatalog = catalog;
    }

    public Map<String, Set<String>> getaCatalog(){
        return aCatalog;
    }

    public static void main(String[] args) {
        //creating map inside the Catalog class
        Catalog cat = new Catalog();

        String key1 = "k1";
        Set<String> setValue = new HashSet<>();
        setValue.add("abc");
        setValue.add("bca");
        setValue.add("xya");

        String key2 = "k2";
        Set<String> setValue2 = new HashSet<>();
        setValue2.add("asd");
        setValue2.add("fgh");
        setValue2.add("jkl");

        cat.getaCatalog().put(key1, setValue);
        cat.getaCatalog().put(key2, setValue2);

        Iterator i1 = setValue.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
    }

}
