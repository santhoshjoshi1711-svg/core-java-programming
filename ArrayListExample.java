import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("SQL");
        languages.add("Spring");
        languages.add("React");

        Collections.sort(languages);

        for (String language : languages) {
            System.out.println(language);
        }
    }
}
