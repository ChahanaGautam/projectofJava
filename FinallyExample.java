package Exception;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("Exception caught:" +e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
