package SeleniumPractice.Day8;

public class ImpleClass extends AbstractClass{

    @Override
    public void abstractclassmethod() {
        System.out.println("abstract class method");
    }

    public static void main(String[] args){
        System.out.println(InterfaceEx1.empcount);
        ImpleClass obj = new ImpleClass();
        obj.interfacem1();
        obj.abstractclassmethod();
        obj.normalmethod();
    }
}
