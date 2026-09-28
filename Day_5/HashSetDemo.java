import java.util.HashSet;
public class HashSetDemo{
    public static void main(String[] args){
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(10);
        System.out.println("Numbers: " +numbers);
        System.out.println("Size : " +numbers.size());
        System.out.println("Contains 20: " +numbers.contains(20));
        System.out.println("Contains 50: " +numbers.contains(50));
        numbers.remove(20);
        System.out.println("Numbers after removing 20: " +numbers);
        numbers.add(50);
        System.out.println("Numbers after adding 50: " +numbers);
        numbers.clear();
        System.out.println("Numbers after clearing: " +numbers);
    }
}