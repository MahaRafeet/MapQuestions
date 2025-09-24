import java.util.HashMap;
import java.util.Map;

class StudentRegistry {
    public static void main(String[] args) {
    Map<Integer, String>studentIdToName=new HashMap<>();
    studentIdToName.put(1234,"Maha");
    studentIdToName.put(1235,"hanin");
    studentIdToName.put(1236,"manal");
        System.out.println(invertMap(studentIdToName));
    }
    public static Map<String, Integer> invertMap(Map<Integer, String> studentIdToName) {
        Map<String,Integer>nameToStudentId=new HashMap<>();
        for(Map.Entry<Integer,String> entry: studentIdToName.entrySet()){
            nameToStudentId.put(entry.getValue(),entry.getKey());
        }
        return nameToStudentId;
    }
}