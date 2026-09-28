import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapDemo{
    public static void main(String[] args){
        LinkedHashMap<Integer,String> students = new LinkedHashMap<>();
        students.put(103,"Ram");
        students.put(101,"Abhi");
        students.put(102,"kiran");
        students.put(104,"Banu");
        System.out.println("Map: " +students);
        System.out.println("Student 102: " +students.get(102));
        System.out.println("Size : " +students.size());
        System.out.println("Contains key 103: " +students.containsKey(103));
        System.out.println("Contains value 'Banu': " +students.containsValue("Banu"));
        students.put(102,"Sai");
        System.out.println("Map after updating student 102: " +students);
        students.remove(104);
        System.out.println("Map after removing student 104: " +students);
        System.out.println("\nUsing keyset:");
        for(Integer key : students.keySet()){
            System.out.println("Key: " +key + ", Value: " +students.get(key));
        }
        System.out.println("\nUsing entryset:");
        for(Map.Entry<Integer,String> entry : students.entrySet()){
            System.out.println("Key: " +entry.getKey() + ", Value: " +entry.getValue());
        }
    }
}