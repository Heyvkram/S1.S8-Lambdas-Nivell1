import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> randomStrings = Arrays.asList("bombo", "car", "guitar", "grandpa", "water", "ball", "5548", "5", "42");

        List<String> sortedStrings = randomStrings.stream()
                .sorted((string1, string2) -> Integer.compare(string1.length(), string2.length()))
                .collect(Collectors.toList())
                .reversed();

        System.out.println(sortedStrings);

    }
}