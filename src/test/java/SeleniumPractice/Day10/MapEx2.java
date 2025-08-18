package SeleniumPractice.Day10;
import java.util.*;

public class MapEx2 {
    public static void main(String[] args){
        HashMap<Integer,String> obj = new HashMap<Integer,String>();
        obj.put(111,"Pavan");
        obj.put(222,"Naveen");
        obj.put(333,"Ratan");

        System.out.println(obj);

        TreeMap<Integer,String> obj1 = new TreeMap<Integer,String>();
        obj1.putAll(obj);
        System.out.println(obj1);

        Set setobj = obj1.entrySet();
        Iterator itobj = setobj.iterator();

        while(itobj.hasNext()){
            Map.Entry ecentry = (Map.Entry) itobj.next();
            System.out.println(ecentry.getKey()+"   "+ecentry.getValue());
        }
    }
}
