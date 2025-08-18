package SeleniumPractice.Day8;

import java.util.ArrayList;

public class ToArray {

    public static void main(String[] args){

        ArrayList al = new ArrayList();
        al.add("PAVAN");
        al.add("TeamLead");
        al.add("CGI");

        System.out.println(al);

        Object[] arrayeles = al.toArray();
        for(Object ecobj:arrayeles){
            System.out.println("Array elements : "+ecobj);
        }
    }
}
