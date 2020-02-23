package quizful;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App3 {
    static String readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }
}
