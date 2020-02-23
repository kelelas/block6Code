package part1.package3;

public class App12 {
    public static double sqr(double arg) {
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return arg * arg;
         //   while (true);
        } else {
            throw new RuntimeException();
        }
        }
}
