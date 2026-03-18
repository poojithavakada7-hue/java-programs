import java.io.*;

class FileNotFoundExceptionExample {
    public static void main(String[] args) 
    throws FileNotFoundException {
        FileInputStream file = new FileInputStream("abc.txt");
    }
}