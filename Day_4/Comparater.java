import java.util.ArrayList;
import java.util.Comparator;
public class Comparater {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });
        System.out.println(numbers);
        ArrayList<String> students  = new ArrayList<>();
        students.add("Ram");
        students.add("Ravi");
        students.add("kiran");
        students.remove(index:2);
        System.out.println("Students: " +students);
        System.out.println("First student: " +students.get(0));
        students.set(1, "Ravi");
        System.out.println("After update: "+ students);
        student.remove("kiran");
        System.out.println("After remove: "+ students);
        if(students.contains("Ravi")){
            System.out.println("Ravi is present in the list");
        }
        System.out.println("Total students: " +students.size());
    }
}