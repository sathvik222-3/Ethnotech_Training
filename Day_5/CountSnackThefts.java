import java.util.*;
public class CountSnackThefts {
    public static Map<String, Integer> countSnackThefts(String[] grabLog) {
        Map<String, Integer> map = new HashMap<>();
        for (String name : grabLog) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        return map;
    }
    public static void main(String[] args) {
        String[] grabLog = {"Mia", "Leo", "Mia", "Sam", "Mia", "Leo"};
        Map<String, Integer> result = countSnackThefts(grabLog);
        System.out.println(result);
        String maxName = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
              String name = entry.getKey();
              int count = entry.getValue();
            if (count > maxCount ||
                (count == maxCount && name.compareTo(maxName) < 0)) {
                maxName = name;
                maxCount = count;
            }
        }
        System.out.println(
            "Prime suspect: " + maxName + " (" + maxCount + " snacks)"
        );
    }
}