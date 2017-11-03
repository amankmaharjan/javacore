package generic;

public class Main {
    public static void main(String[] args) {
//        MyGen<Integer> m = new MyGen<Integer>();
//        m.setObj(2);
////        m.set("vivek");//Compile time error
//        System.out.println(m.getObj());

        MyGen<String> s = new MyGen<String>();
//         s.setObj(2);//Compile time error
        s.setObj("vivek");
        System.out.println(s.getObj());

    }

}
