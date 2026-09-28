import java.util.ArrayList;
import java.util.Comparator;
public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> students  = new ArrayList<>();
        students.add("Ram");
        students.add("Abhi");
        students.add("kiran");
        students.add("Banu");
        students.add("Sai");
        System.out.println("Before Students: " +students);
        students.remove(2);
        System.out.println("Students: " +students);
        students.remove("kiran");
        System.out.println("After remove: "+ students);
        if(students.contains("Ravi")){
            System.out.println("Ravi is present in the list");
        }
        students.add( 2,"Alax");
        System.out.println("After adding: "+ students);
        System.out.println("Total students: " +students.size());
        students.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println("After sorting: " +students);
    }
}