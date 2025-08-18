package SeleniumPractice.Day10;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args){
        //HashMap obj = new HashMap();
          HashMap<Integer,String> obj = new HashMap<Integer,String>();
        System.out.println("No entries so returns : "+obj.isEmpty());



        obj.put(111,"Pavan");
        obj.put(222,"Ratan");
        obj.put(333,"Naveen");

        System.out.println(obj);

        System.out.println("Key 222 value is : "+obj.get(222));
        obj.remove(222);
        System.out.println("After removing 222 key : "+obj);

        System.out.println("key 222 removed so should get : "+obj.containsKey(222));
        System.out.println("key 222 and value removed so should get : "+obj.containsValue("Ratan"));

        System.out.println("Contains entries so returns : "+obj.isEmpty());

        System.out.println("Total entries is : "+obj.size());
        /*obj.clear();
        System.out.println("No entries : "+obj);
        System.out.println(obj.isEmpty());*/

        System.out.println(obj.keySet());
        System.out.println(obj.values());
        System.out.println(obj.entrySet());

        for(Object eckey:obj.keySet()){
            System.out.println(eckey);
        }

        for(Object ecval:obj.values()){
            System.out.println(ecval);
        }

        for(Object ecky:obj.keySet()){
            System.out.println(ecky+" "+obj.get(ecky));
        }

        for(Map.Entry ecentry:obj.entrySet()){
            System.out.println(ecentry.getKey()+" "+ecentry.getValue());
        }

    }
}
