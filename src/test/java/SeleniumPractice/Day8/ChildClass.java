package SeleniumPractice.Day8;

public class ChildClass extends ParentClass{
    public void m1(){
        System.out.println("m1 method update");
    }
    public static void main(String[] args){
        ParentClass obj = new ChildClass();
        obj.m1();
    }
}
