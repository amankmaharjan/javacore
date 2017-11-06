import java.io.*;
import java.util.Scanner;

public class BufferedWriterExample {
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("D:\\testout.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to javatpoint.");
    Scanner s = new Scanner(System.in);
    System.out.println("name:");
    buffer.write(s.next());
    System.out.println("address:");
    buffer.newLine();
    buffer.write("\n"+s.next());

    buffer.close();  
    System.out.println("Success");  
    }  
}  