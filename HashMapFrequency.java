import java.util.HashMap;
import java.util.Map;

public class HashMapFrequency {
    public static void main(String[] args) {
        String[] words = {"java", "sql", "java", "spring", "java", "sql"};
        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println(frequency);
    }
}
