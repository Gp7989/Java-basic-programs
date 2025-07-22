import java.util.*;
public class threead extends Thread {
    @Override
    public void run(){
      //  System.out.println("run");
        for(int i =1 ;i<=20;i++){
            System.out.println("thread");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        threead obj = new threead();
        obj.start();
       // System.out.println("main class");
        for(int i =1 ;i<=20;i++){
            System.out.println("main thread");
            int a = sc.nextInt();
        }
    }
}
