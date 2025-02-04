public class Main {
    public static void main(String[] args) {
        Reverse reverseWord = (word) -> {return new StringBuilder(word).reverse().toString();};

        String testWord = "sprint";

        System.out.println(testWord);
        System.out.println(reverseWord.reverse(testWord));
    }
}