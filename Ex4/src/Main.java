import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> monthsOfTheYear = Arrays.asList("January", "February", "March", "April", "May", "June", "August", "September", "October", "November", "December");

        monthsOfTheYear.forEach(System.out::println);
    }
}