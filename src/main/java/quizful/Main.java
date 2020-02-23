package quizful;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(" ");
        }catch (FileNotFoundException ex){
            System.out.println("Oops, FileNotFoundException caught");
        }catch (IOException e) {
            System.out.println("IOEXCEOTION");
        }
    }
}
