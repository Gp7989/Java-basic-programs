public class oopsdemo {
     void run() {    // static ke saath obj ki zarurrat nhi hoti
        System.out.println(" Hello ");
    }
}

   class test extends oopsdemo {
       void drink() {
           System.out.println("Drinking");
       }
   }

   class test2 extends oopsdemo {
       void eat() {
           System.out.println("eating");
       }

       public static void main(String[] args) {
           test obj1 = new test();
           test2 obj2 = new test2();


           obj1.drink();
           obj2.eat();
          obj1.run();

       }
   }


