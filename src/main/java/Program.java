public class Program {

    public static String method() {
        return "some data";
    }

    public static String method(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException();
        }
        return String.format("some data %d", x);
    }
}
