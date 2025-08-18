package SeleniumPractice.Day9;

import java.util.ArrayList;

public class AutoBox1 {
    public static void main(String[] args){

        ArrayList<Integer> al = new ArrayList<Integer>(); // int -> Integer // Autoboxing
        al.add(111);
        al.add(222);
        al.add(333);

        System.out.println(al);

        int twoe = al.get(1); // Integer -> int auto unboxing
        System.out.println(twoe);



    }
}
