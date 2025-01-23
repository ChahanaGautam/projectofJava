public class ArithmeticOperatorsinDifferentForms {
    public static void main(String[] args) {
        int a = 30, b = 12;
        //Using arithmetic operators in expressions
        System.out.println("\nArithmetic Operators in Expressions:");
        int result = (a + b)*(a-b); // Expression
        System.out.println("(a + b)*(a-b)=" + result);

         // Handling floating-point numbers

        System.out.println("\nFloating-Point Arithmetic:");
        double x = 15.0, y = 4.0;
        System.out.println("x/y=" +(x/y)); // Division
        System.out.println("x% y = " + (x % y)); // Modulus
        //combining operators
        System.out.println("Combining operators:");
        int c = 10;
        c+=5; //Equivalent to c=c+5
        System.out.println("c+=5->c="+c);
        c*=2; //Equivalent to c=c*2
        System.out.println("c*=2->c="+c);
    }
}
