import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterExample {
    public static void main(String args[]) {
        try {
            File file = new File("testout.txt");
            FileWriter fw = new FileWriter(file,true);
            Scanner s = new Scanner(System.in);

            System.out.println("name:");
            fw.write(s.next());
            System.out.println("address:");
            fw.write(s.next());

            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}  