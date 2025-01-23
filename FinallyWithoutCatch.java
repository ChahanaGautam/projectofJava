package Examples;

public class FinallyWithoutCatch {

        public static void main(String[] args) {
            try {
                System.out.println("Try block executed");
            } finally {
                System.out.println("Finally block executed");
            }
        }
    }

