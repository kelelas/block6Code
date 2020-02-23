package part2.package4;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App2 {
    public static void main(String[] args) throws IOException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}
