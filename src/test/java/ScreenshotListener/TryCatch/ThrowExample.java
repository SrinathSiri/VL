package ScreenshotListener.TryCatch;

public class ThrowExample {

    public static void main(String[] args) {

        int age = 15;
        if (age < 18) {
            throw new ArithmeticException("Age must be above 18 to vote");
        }
        System.out.println("Age is valid to vote");
    }
}
