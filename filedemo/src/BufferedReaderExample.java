import java.io.*;
public class BufferedReaderExample {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:\\testout.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          String i;
          while((i=br.readLine())!=null){
          System.out.print(i);
          }  
          br.close();    
          fr.close();    
    }    
}    