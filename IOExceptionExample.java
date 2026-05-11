<<<<<<< HEAD
import java.io.*;

class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.txt");
            fr.read();
        } catch(IOException e) {
            System.out.println("File error");
        }
    }
=======
import java.io.*;

class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.txt");
            fr.read();
        } catch(IOException e) {
            System.out.println("File error");
        }
    }
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}