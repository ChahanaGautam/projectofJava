package Exception;

public class ThrowsDemo {

        public static void main(String[] args) {
            try {
                throwException();
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }

        public static void throwException() throws Exception {
            throw new Exception("This is a custom exception.");
        }
    }

