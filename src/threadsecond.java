import org.w3c.dom.ls.LSOutput;
import java.util.*;

public class threadsecond implements Runnable {
    Scanner sc = new Scanner(System.in);
    @Override
    public void run(){
        System.out.println("run");
    }
   static int sum(int a , int b) {
       // a = sc.nextInt();
       // b = sc.nextInt();
       // int c = a + b;
        //System.out.println(c);
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thread obj = new Thread(){
            @Override
                    public void run() {
                System.out.println("thread1");

            }
        };
        Thread obj2 = new Thread(){
            @Override
            public void run(){
                System.out.println("Thread2");
            }
        };
       Thread obj3 = new Thread(){
           @Override
           public void run(){
               System.out.println("obj 3 ");
               System.out.println(sum(sc.nextInt(),sc.nextInt()));

           }
       };
//obj.start();
        threadsecond rn = new threadsecond();
        Thread rn2 = new Thread(rn);
        rn2.start();
        obj3.start();
        obj.start();
        while (obj.isAlive()){
            System.out.println(" obj3 run in bc");
        }


        obj2.start();

        System.out.println(obj.getName());
        System.out.println(obj3.getPriority());
        System.out.println(obj2.getState());
        obj2.setPriority(3);
        System.out.println(obj2.getPriority());
    }
}
