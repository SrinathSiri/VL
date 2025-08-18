package SeleniumPractice.Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args){
        ArrayList obj = new ArrayList();
        obj.add(100);
        obj.add(200);
        obj.add(25000);
        obj.add(50);

        //System.out.println(obj);

        //System.out.println(obj.get(1));

        //System.out.println(obj.contains("Pavan"));

       /* Iterator it = obj.iterator();
        while(it.hasNext()){
            //System.out.println("Printing each element in ArrayList : "+it.next());
        }*/

        ArrayList abc = new ArrayList();
        abc.addAll(obj);
        System.out.println(abc);

        Collections.sort(abc);

        System.out.println("After sorting : "+abc);

        Collections.sort(abc,Collections.reverseOrder());
        System.out.println("After reverse : "+abc);

        Collections.shuffle(abc);
        System.out.println("After shuffling : "+abc);
    }
}
