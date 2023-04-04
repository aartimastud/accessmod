package CollectionP;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    Map<String, String > studentDetails = new HashMap<>();

    public Map<String, String> getStudentDetails(){
        studentDetails.put("1","Aarti");
        studentDetails.put("3","Samvida");
        studentDetails.put("2","Amol");
        studentDetails.put("4","Nitish");
        return studentDetails;
    }
}
