import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Car", "Horse", "Monkey", "Smoke", "Apple", "Cat");

        List<String> wordsWithO = list.stream()
                .filter(word -> word.contains("o"))
                .collect(Collectors.toList());

        System.out.println(wordsWithO);
    }
}