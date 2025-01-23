public class BitwiseOperators {

        public static void main(String[] args) {
            int a = 5;  // 0101 in binary
            int b = 3;  // 0011 in binary

            // AND (&) operator
            System.out.println("a & b: " + (a & b));//Binary: 0001 (1 in decimal)
            // OR (|) operator
            System.out.println("a | b: " + (a | b)); //Binary: 0111(7 in decimal)
            // XOR (^) operator
            System.out.println("a ^ b: " + (a ^ b));//Binary: 0110 (6 in decimal)
            // Complement (~) operator
            System.out.println("~a: " + (~a));//Inverts all bits (two's complement)
            // Left Shift (<<) operator
            System.out.println("a << 1: " + (a << 1));//Binary: 1010 (10 in decimal)
            // Right Shift (>>) operator
            System.out.println("a >> 1: " + (a >> 1));//Binary: 0010 (2 in decimal)
        }
    }

