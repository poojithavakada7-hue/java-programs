import java.io.*;

class StudentDemo 
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter roll number: ");
        int rno = Integer.parseInt(br.readLine());

        System.out.print("Enter Gender (M/F): ");
        char gender = (char) br.read();
        br.skip(2); 
        System.out.print("Enter Student name: ");
        String name = br.readLine();
        System.out.println("Roll No.: " + rno);
        System.out.println("Gender: " + gender);
        System.out.println("Name: " + name);
    }
}