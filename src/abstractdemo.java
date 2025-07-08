abstract class abstractiondemo{
    void run(){
        System.out.println("running");
    }
    abstract void eat();

    public static void main(String[] args) {
        abstractiondemo obj = new abstractiondemo() {
            @Override
            void eat() {
                System.out.println("eating pizza");
            }
        };
        abstractiondemo obj2 = new abstractiondemo() {
            @Override
            void eat() {
                System.out.println("eating roti");
            }
        };

        obj.eat();
        obj2.eat();

    }
}



