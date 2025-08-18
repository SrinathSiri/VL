package SeleniumPractice.Day8;

public abstract class AbstractClass implements InterfaceEx1{
    public abstract void abstractclassmethod();
    public void normalmethod(){
        System.out.println("Normal Method");
    }

    @Override
    public void interfacem1() {
        System.out.println("Interface Abstract Method M1");
    }
}
