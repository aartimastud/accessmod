package CollectionP;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentArrayListEx {
    public static void main(String[] args) {
        ArrayList<Student> sList = new ArrayList<Student>();

        StudentObj so = new StudentObj();
        //adding student to list
        for (int i=0; i<6; i++){
            sList.add(so.st[i]);
        }

        for (Student s : sList) {
            System.out.println("Student details: " +s);
        }

//        using iterator
        Iterator i1 = sList.iterator();
        while (i1.hasNext()){
            System.out.println("Student iterator: "+ i1.next());
        }

//        using tostring
        System.out.println("Using toString: "+ sList.toString());

        //searching
        String name = "Aarti";
        for(Student s: sList){
            if(s.getName().equals(name)){
                System.out.println("Search name: "+s);
            }
        }

        String city = "Pune";
        for(Student s: sList){
            if (s.getCity().equals(city)){
                System.out.println("Searched city: "+s );
            }
        }


        sList.sort(Comparator.comparing(Student:: getId));
        System.out.println("Sorted List");
        for (Student s: sList){
            System.out.println("Student Details" +s);
        }

        System.out.println(" ");

        sList.sort(Comparator.comparing(Student:: getName));
        System.out.println("Sorted List");
        for (Student s: sList){
            System.out.println("Student Details" +s);
        }
    }
}
