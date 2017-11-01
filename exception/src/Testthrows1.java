import java.io.IOException;  
class Testthrows1{  
  void m()throws  ClassNotFoundException,IOException{
    throw new IOException("device error");//checked exception
//     throw new ArithmeticException();
  }  
  void n()throws IOException{
    try {
        m();
    }
    catch (ClassNotFoundException e){
        System.out.println(e);
    }
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled"+e);}
  }  
  public static void main(String args[]){  
   Testthrows1 obj=new Testthrows1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  