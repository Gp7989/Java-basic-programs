package collection;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer , String> list = new HashMap<>();
        list.put(1 , "Gaurav");
        list.put(2 , "Saurav");
        list.put(3 , "saurav");
        list.put(1 , "gaurav");
        list.put(5, "null");
        System.out.println(list);
     //   Set s = list.entrySet();
     //   Iterator itr = s.iterator();
       // while (itr.hasNext()){
         //   System.out.println(itr.next());
        //}
        for (Map.Entry<Integer , String> me :  list.entrySet()){
            System.out.println(me.getKey()+" "+ me.getValue());
        }

    }
}
