package generic;

public class WrapperClassDemo {
    public static void main(String[] args) {
        //Converting int into Integer
        int a = 20;
        Integer i = Integer.valueOf(a);//converting int into Integer
        Integer j = a;//autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a + " " + i + " " + j);

        //Converting Integer to int
        Integer b=new Integer(3);
        int x=b.intValue();//converting Integer to int
        int y=a;//unboxing, now compiler will write a.intValue() internally

        System.out.println(b+" "+x+" "+y);

    }
}

