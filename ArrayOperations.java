import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        Arrays.sort(numbers);

        System.out.println("Sum: " + sum);
        System.out.println("Sorted: " + Arrays.toString(numbers));
    }
}
