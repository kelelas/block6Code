package part1.package7;

public class App3 {
    public static void main(String[] args) {
        try {
            System.exit(42);
        } finally {
            System.err.println("finally");
        }
    }
}
