package CollectionP;

import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        MapEx ex1 = new MapEx();
        Map<String, String> m1 = ex1.getStudentDetails();
        System.out.println(m1);
        Set<String> keys = m1.keySet();
        Iterator<String> iterator = keys.iterator();
        System.out.println("Student Details: ");
        while (iterator.hasNext()){
            String rollNo = iterator.next();
            String name = m1.get(rollNo);
            System.out.println("Roll no: "+rollNo +" Name: "+name);
        }
    }
}
