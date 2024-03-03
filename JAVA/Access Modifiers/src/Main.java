public class Main {
    public static void main(String[] args) {
        byte a = 10, result = 0;
        for (int i = 0; i < 3; i++) {
            result = a << 1;
        }
        System.out.println(result);
    }
}