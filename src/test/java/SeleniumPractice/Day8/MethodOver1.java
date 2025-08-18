package SeleniumPractice.Day8;

public class MethodOver1 {

    public void m1(int a){
        a = 10;
        System.out.println(a);
    }

    public void m1(){           // method overloading
        System.out.println("M1 method");
    }

    public static void main(String[] args){
        MethodOver1 obj = new MethodOver1();
        obj.m1(10);
        obj.m1();
    }


}
