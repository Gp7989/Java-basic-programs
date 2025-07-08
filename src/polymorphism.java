public class polymorphism {
    int Sum(int a , int b , int c){
        System.out.println(a+b+c);
        return a+b+c;
    }

}
class Run extends polymorphism {

    double Sum(double a , double b){
        System.out.println(a+b);
        return a+b ;
    }

    public static void main(String[] args) {
        polymorphism obj = new polymorphism();
        Run obj2 = new Run();

        obj.Sum(7,8,9);
        obj2.Sum(9,8); // override
    }
}
