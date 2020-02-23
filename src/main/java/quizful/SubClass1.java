package quizful;

import java.io.FileNotFoundException;

public class SubClass1 {
    public void start() throws FileNotFoundException {
        throw new FileNotFoundException("Not able to start");
    }
}
