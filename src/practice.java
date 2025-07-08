
/*public class practice {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = a ^ b ;
        System.out.println(c);
   }
}
*/
/*import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number");
        int num = sc.nextInt();
    }
} */

/*import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("a is " + a + " and b is "+ b + " add the addition of both is " + c);
    }
}
*/
/*
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of sub A");
        int A = sc.nextInt();
        System.out.println("enter the marks of  sub B");
        int B = sc.nextInt();
        System.out.println("enter the marks of sub C");
        int C = sc.nextInt();
        System.out.println("enter the marks of sub D");
        int D = sc.nextInt();
        System.out.println("enter the marks of sub E");
        int E = sc.nextInt();
        int sum = A+B+C+D+E;
        float percentage = (float)sum / 5;
        System.out.println("the sum of 5 subject is " + sum);
        System.out.println("the percentage is " + percentage);
    }
}
 */
/*
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of Principle");
        Double P = sc.nextDouble();
        System.out.println("rate");
        int R = sc.nextInt();
        System.out.println("years");
        int T = sc.nextInt();

        Double A = P * Math.pow((1 + (float)R / 100 ) , T);
        Double S_I = (P*R*T) / 100 ;
        Double C_I = A - P ;
        System.out.println("simple interest is " + S_I);
        System.out.println("compound interest is " + C_I);
    }
}
 */
/*
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of radius ");
        Double radius = sc.nextDouble();
        Double circumference = 2*(22/7)*radius;
        Double Area = (22/7)*Math.pow(radius , 2);
        System.out.println("circumference is " + circumference);
        System.out.println("Area is " + Area);
    }
}

 */
/*
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temp value in celcius");
        Double C = sc.nextDouble();
        double F = (C * 9/5) + 32;
        System.out.println("The " + C + " celsius in fahrenheit " + F);
    }
}
*/
/*
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of A");
        int A = sc.nextInt();
        System.out.println("enter the marks of B");
        int B = sc.nextInt();
        int C = A;
        A = B;
        B = C;
        System.out.println("after swapping the value of A is " + A + " and the value of B is " + B);
    }
} */
/*import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Value of A");
        int A = sc.nextInt();
        System.out.println("enter the Value of B");
        int B = sc.nextInt();
        if (A == B) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
 */
/*
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Value of A");
        int A = sc.nextInt();
        System.out.println("enter the Value of B");
        int B = sc.nextInt();
        System.out.println("enter the Value of C");
        int C = sc.nextInt();
        if(A>B){
            if(A>C){
                System.out.println("A is greatest");
            } else{
                System.out.println("C is greatest");
            }
        } else if (B>C){
            System.out.println("B is greatest");
        } else {
            System.out.println("C is greatest");
        }
        }
        }
 */
/*
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Value ");
        int Value = sc.nextInt();
        if(Value % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }}
 */
/*import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year ");
        int year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || (year % 400 == 0 )){
            System.out.println("Leap year ");
        }else{
            System.out.println("not leap year");
        }
    }}
 */
import java.sql.SQLOutput;
/*
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of sub A");
        int A = sc.nextInt();
        System.out.println("enter the marks of  sub B");
        int B = sc.nextInt();
        System.out.println("enter the marks of sub C");
        int C = sc.nextInt();
        System.out.println("enter the marks of sub D");
        int D = sc.nextInt();
        System.out.println("enter the marks of sub E");
        int E = sc.nextInt();
        float P =( A +  B +   C +  D +  E) / 5;
        System.out.println("Percentage is " + P);
        if(P>= 90){
            System.out.println("garde A");
        } else if (P>= 80 && P < 90) {
            System.out.println("grade b");
        } else if (P>=60 && P < 80){
            System.out.println("grade c");
        }
        else{
            System.out.println("grade d");
        }
    }
} */
/*
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        double num = sc.nextInt();
        int a = 0;
        int i = 0;
        while (i <= num) {
            a = a + i;
            i++;
        }
        System.out.println(a);
    }
} */
/*import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num = sc.nextInt();
        int totalsum = (num * (num + 1)) / 2;
        System.out.println("toatalsum is " + totalsum);
    }
}
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int num = sc.nextInt();
        int i=0;

    }
}

 */
/*
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("enter");
        int num = sc.nextInt();

        for (int i = num; i<=num; i--){
            System.out.println(i);
    }
    }
}
 */
/*
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num");
        int num = sc.nextInt();
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(num +" * " + i + " = " + num*i);
        }
        sc.close();
    }
}

import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num");
        int num = sc.nextInt();
        int count = 1;

        for (int i = 1 ; i <= num; i++){
            count = count*i;
            System.out.println(num);
        }
        System.out.println(count);
    }
}



import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num");
        int num = sc.nextInt();
        boolean num1 = true;
    }
}
*/
/*
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of sub A");
        int A = sc.nextInt();
        System.out.println("enter the marks of  sub B");
        int B = sc.nextInt();
        System.out.println("enter the marks of sub C");
        int C = sc.nextInt();
        System.out.println("enter the marks of sub D");
        int D = sc.nextInt();

        float P = (A + B + C + D) / 4;
        System.out.println("Percentage is " + P);
        if (P > 90) {
            System.out.println("grade A");
        } else if (P > 70 && P <= 90) {
            System.out.println("grade b");
        } else if (P >= 60 && P < 70) {
            System.out.println("grade c");
        } else if (P >= 40 && P < 60) {
            System.out.println("grade d");
        }
        else{
                System.out.println("fail");
            }
        }
    }

/*
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your unit ");
        int unit = sc.nextInt();
        int bill = 0;
        if(unit <= 100){
            bill = unit*6;
            System.out.println("bill is " + bill);
        }
        else if (unit <= 150){
            bill = (50*7) + (unit-100)* 7 ;
            System.out.println("bill is " + bill);
        }
        else if (unit <= 200){
            bill = (50*7) + (100 * 7) + (unit - 150)*10;
            System.out.println("bill is " + bill);
        }
        else if (unit <= 300){
            bill = (50*7) + (100 * 7) + (200*10) + (unit - 200)* 15;
            System.out.println("bill is " + bill);
        }
        else if (unit > 300){
            bill = (50*7) + (100 * 7) + (200*10) +  (200 * 15) + (unit - 300)*20;
            System.out.println("bill is " + bill);
        }

    }
}

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int originalnum = num;
        int digit = String.valueOf(num).length();
        while(num>0){

        }
    }
}

public class practice {
    int age = 87;
    static int num = 876;

    public static void main(String[] args) {
        System.out.println(num);
        practice obj = new practice();
        System.out.println(obj.age);
    }
}

 */










