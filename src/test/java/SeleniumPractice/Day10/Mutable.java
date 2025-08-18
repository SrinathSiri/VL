package SeleniumPractice.Day10;

public class Mutable {

    public static void main(String[] args){

        String S1 = "PAVAN";
        String S2 = S1.concat("KALYAN");

        System.out.println(S1);

        System.out.println(S2);

       StringBuffer sb1 = new StringBuffer(S1);
       sb1.append("KONIDALA");

       System.out.println(sb1);


    }
}
