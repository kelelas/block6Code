package scask;

public class ThrowDemo2 {
    static void procedure() throws IllegalAccessException
    {
        System.out.println(" inside procedure");
        throw new IllegalAccessException("demo");
    }
    public static void main(String aigs[]) {
        try {
            procedure();
        }
        catch (IllegalAccessException e) {
            System.out.println("caught" + e);
        }
    }
}
