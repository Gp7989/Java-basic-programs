//import java.util.Scanner;
import java.util.Stack;
public class stackDemo {
    public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
       Stack<Integer> list = new Stack<>();
        list.add(33);
        list.add(23);
        list.add(34);
        list.add(90);
        for (Integer num : list) {
            System.out.println(num);
        }
        System.out.println( list.push(43));
        //list.pop();
        System.out.println(list);
        System.out.println(list.peek());
    }
}
