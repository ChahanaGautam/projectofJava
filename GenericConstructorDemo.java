public class GenericConstructorDemo<T> {
        private T value;

        // Generic constructor
        public GenericConstructorDemo(T value) {
            this.value = value;
            System.out.println("Value: " + value);
        }

        public T getValue() {
            return value;
        }

        public static void main(String[] args) {
            GenericConstructorDemo<Integer> intObj = new GenericConstructorDemo<>(100);
            GenericConstructorDemo<String> stringObj = new GenericConstructorDemo<>("Hello, Generics!");
        }
    }

