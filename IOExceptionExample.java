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
}