public class StringReverse {
    public static void main(String[] args) {
        String input = "Java Developer";
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
