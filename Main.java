public class Main {
    public static void main(String[] args) {
        System.getenv().forEach((k, v) -> System.out.printf("%s=%s\n", k, v));
    }
}