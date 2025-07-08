public interface Interface {
    void run();

    public static void main(String[] args) {
        Interface obj = new Interface() {
            @Override
            public void run() {
                System.out.println("running");
            }
        };
        obj.run();
    }
}