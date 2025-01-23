public class LogicalOperators {

        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;

            // AND (&&) Operator
            if (num1 > 5 && num2 > 15) {
                System.out.println("Both conditions are true.");
            }

            // OR (||) Operator
            if (num1 > 15 || num2 > 15) {
                System.out.println("At least one condition is true.");
            }

            // NOT (!) Operator
            boolean isEven = (num1 % 2 == 0);
            if (!isEven) {

                System.out.println(num1 + "is not an even number.");

            } else {

                System.out.println(num1 + "is an even number.");


            }
        }
}
