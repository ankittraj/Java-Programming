public class reverseString {

    public static void main(String[] args) {
        String text = "Hello World";
        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println("Reversed string: " + reversedText);
    }
}