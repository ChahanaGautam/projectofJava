package Examples;

public class ExceptionPropagation {

        public static void main(String[] args) {
            try {
                methodA();
            } catch (ArithmeticException e) {
                System.out.println("Exception handled: " + e.getMessage());
            }
        }

        static void methodA() {
            methodB();
        }

        static void methodB() {
            int result = 10 / 0; // Will throw ArithmeticException
        }
    }

