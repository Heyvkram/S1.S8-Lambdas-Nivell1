public class Main {
    public static void main(String[] args) {
        PiClass piNumber = () -> {return 3.1415;};
        System.out.println(piNumber.getPiValue());
    }
}