
    interface MyInterface {
        void myMethod();
    }

    public class interfaceImplementor {
        public static void main(String[] args) {


            // Anonymous class implementing MyInterface
            MyInterface obj = new MyInterface() {
                @Override
                public void myMethod() {
                    System.out.println("Anonymous class implementation of myMethod.");
                }
            };

            // Calling the method
            obj.myMethod();

            // Lambda expression implementing MyInterface
            MyInterface obj2 = () -> {
                System.out.println("Lambda expression implementation of myMethod.");
            };

            // Calling the method
            obj2.myMethod();
        }
    }


