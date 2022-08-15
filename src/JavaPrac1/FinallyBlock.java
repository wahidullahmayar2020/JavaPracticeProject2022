package JavaPrac1;

import javax.imageio.stream.ImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;




public class FinallyBlock {
    public static void main(String[] args) {
        try {
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("FilePath");
            prop.load(fis);
        } catch (IOException e) {
            System.out.println("I am an exception block");
        } finally {
            System.out.println("I am final block");
        }
        System.out.println("Running script after exception");
    }
    }
