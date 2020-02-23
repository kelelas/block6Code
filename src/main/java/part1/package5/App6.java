package part1.package5;

public class App6 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2");
            if (true) {throw new Error();}
        } catch (Error e) {
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }
}
