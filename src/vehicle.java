public class vehicle {

        void run() {
            System.out.println("car is running fast");
        }
    }

    class scooter extends vehicle {
    @Override
        void run() {
            System.out.println("scooter is running smoothly");
        }
    }

    class bike extends vehicle {
    @Override
        void run() {
            System.out.println("bike is running slow");
        }


        public static void main(String[] args) {
            vehicle obj = new vehicle();
            scooter obj2 = new scooter();
            bike obj3 = new bike();
            obj.run ();
            obj2.run ();
            obj3.run ();
        }
    }


