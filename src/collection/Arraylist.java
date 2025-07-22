package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//import static jdk.internal.org.jline.utils.Colors.s;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list  = new ArrayList<>();
       list.add(33);
        list.add(23);
        list.add(34);
        list.add(90);
        for(Integer num : list){
            System.out.println(num);

        }
        int c = list.size();
        System.out.println(c);
        System.out.println(list.get(2));
        list.set(2, 876);
        System.out.println(list);
        System.out.println(list.add(87));
        System.out.println(list);

        System.out.println("enetr the size of arraylist" );
        int n = sc.nextInt();
        System.out.println("arraylist size is " + n);
        System.out.println("enter elements" );
        for(int i = 0 ; i< n ; i++){
            int val = sc.nextInt();
            list.add(val);
        }
        System.out.println(list);
        for (int i = list.size()-1; i>=0 ; i--){
            System.out.println("reverse is "+ list.get(i));
        }
        System.out.println(list);
        System.out.println("Gaurav Kumar Pandey");

      //  Set s = list.entrySet();
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
