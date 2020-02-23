package part2.package6;

public class App3 {
    public static void main(String[] args) throws Exception {
        try {
            Throwable t = new Exception();
            //throw t;
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }
}
