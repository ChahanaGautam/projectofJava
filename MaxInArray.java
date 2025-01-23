package Examples;

public class MaxInArray {

        public static void main(String[] args) {
            int[] numbers = {3, 7, 1, 9, 5};
            int max = numbers[0];
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Maximum element: " + max);
        }
    }


