package SeleniumPractice.Day9;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args){
        HashSet obj = new HashSet();
        obj.add(001);
        obj.add("PAVAN");
        obj.add("SDET");
        obj.add(200000);
        System.out.println(obj);

        Iterator it = obj.iterator();
        while(it.hasNext()){
           System.out.println(it.next());
        }
    }
}
