import java.util.Scanner;
public class method {
    int add ( int a, int b){
       System.out.println(a+b);
       return a+b;
    }
    int add ( int a, int b ,int c){
        System.out.println(a+b+c);
        return a+b+c;
    }
    double add ( double a, int b){
        System.out.println(a+b);
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        method obj = new method();
       // System.out.println(obj.add(57,76));
        obj.add(sc.nextInt(),sc.nextInt(),sc.nextInt());
        obj.add(sc.nextDouble(),sc.nextInt());
    }
}

 /*
import java.util.Scanner;
public class method {

    long fac(int num){
        int val = 1;
        for(int i = 1; i<= num; i++){
            val = val * i;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        method obj = new method();
        System.out.println("enter the value of num");
        long numb = obj.fac(sc.nextInt());
        System.out.println("fac is " + numb);

        long i =obj.fac(5);
        System.out.println(i);
    }
}

 */
