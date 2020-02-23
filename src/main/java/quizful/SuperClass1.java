package quizful;

import java.io.IOException;

public class SuperClass1 {
    public void start() throws IOException{
        throw new IOException("Not able to open file");
    }
}
