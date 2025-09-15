
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
import java.util.Scanner;

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


public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //-------------------------------array1----------------------------------------
        System.out.println("Enter the size of array");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the values of first array");
        for(int i=0 ; i<size1 ; i++){
            System.out.println("Enter value" + (i+1));
            arr1[i] = sc.nextInt();
        }
        System.out.println("array 1 created");
        /*System.out.println("Array1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }

        //------------------------------array2---------------------------------------
        System.out.println("Enter the size of array");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Enter the values of first array");
        for(int i=0 ; i<size2 ; i++){
            System.out.println("Enter value" + (i+1));
            arr2[i] = sc.nextInt();
        }
        System.out.println("array 2 created");
        /*System.out.println("array2");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }


        //-------------------------------merged------------------------------------
        int[] merged = new int[size1+size2];
        for (int i=0 ; i<size1 ;i++){
            merged[i] = arr1[i];
        }
        for (int i=0 ; i<size2 ; i++){
            merged[i+size2] = arr2[i];
        }

        System.out.println("Merged Array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}


 */
/*

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        int[][] transpose = new int[3][3];

        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
}
}
*/
/*
public class practice {
    public static void main(String[] args) {
        char arr[] = {'G', 'A' , 'U' , 'R' , 'A' ,'V'};
        char arr2[] = {'p'};
        System.out.println(arr);
        String obj = new String(arr);
        String obj2 = new String(arr2);
        System.out.println(obj);
       String fullname = obj + obj2 ;
        System.out.println(fullname);
    }
}
 */
//public class practice {
//    public static void main(String[] args) {
//        StringBuilder name = new StringBuilder("GauaG") ;
//      //  name.append(" kumar ");
//       // name.append("Pandey");
//        String name1 = name.toString();
//        System.out.println(name);
//        StringBuilder str1 = new StringBuilder(name.reverse().toString());
//    //    System.out.println(name.reverse());
////System.out.println(name.reverse());
//        if(name1.toString().equals(str1.toString())  ){
//            System.out.println("name is palindrome ");
//        }
//        else {
//            System.out.println("not palindrome");
//        }
//
//    }
//
//}
//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter days name for know timing of wake up ");
//        String day = sc.next();
//        String result = switch (day)
//        {
//            case "monday" , "Tuesday" , "Wednesday" -> "7am";
//            case "thrusday", "Friday" -> "8am" ;
//            case "saturday " , "sunday " -> "10am";
//            default -> "enter cor'rect name ";
//        };
//        System.out.println(result);
//
//        switch (day) {
//            case "monday" , "tuesday" :
//                System.out.println("7am");
//                break;
//            case "wednesday":
//                System.out.println("8am");
//                break;
//            default :
//            System.out.println("9am");
//        }
//    }
//}
//
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class practice {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lineno = 1;
        while(sc.hasNextLine()){
            String linecont = sc.nextLine();
            System.out.println(lineno + " " + linecont);
            lineno++;
        }
    }
}