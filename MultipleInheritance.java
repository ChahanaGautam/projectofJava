package Examples;


    interface Printer {
        void print();
    }

    interface Scanner {
        void scan();
    }

    class MultifunctionDevice implements Printer, Scanner {
        public void print() {
            System.out.println("Printing a document.");
        }

        public void scan() {
            System.out.println("Scanning a document.");
        }
    }

    public class MultipleInheritance {
        public static void main(String[] args) {
            MultifunctionDevice device = new MultifunctionDevice();
            device.print();
            device.scan();
        }
    }


