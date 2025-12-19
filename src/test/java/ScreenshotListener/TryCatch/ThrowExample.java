package ScreenshotListener.TryCatch;

public class ThrowExample {

    public static void main(String[] args) {

        int age = 17;
        if (age < 18) {
            throw new ArithmeticException("Age must be above 18 to vote");

            //ArithmeticException ex = new ArithmeticException("Age must be above 18 to vote");
            //throw ex;
        }
        System.out.println("Age is valid to vote");
    }
}
