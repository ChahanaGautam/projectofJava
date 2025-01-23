import java.util.Scanner;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        //input 5 numbers from users
        System.out.println("Enter any 5 numbers:");
        for (int i=0; i< numbers.length; i++){
            System.out.println("Enter number:" +(i + 1) +":" );
            numbers[i] = scanner.nextInt();

        }
        System.out.println("The entered numbers are:");
        for (int i=0; i< numbers.length;i++){
            System.out.println("Element at index" +i +":" + numbers[i]);
        }
    }
}
