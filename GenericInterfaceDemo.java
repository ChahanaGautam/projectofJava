
    // Generic interface
    interface GenericInterface<T> {
        void display(T value);
    }

    // Implementation of the generic interface
    class GenericClass<T> implements GenericInterface<T> {
        @Override
        public void display(T value) {
            System.out.println("Value: " + value);
        }
    }

    public class GenericInterfaceDemo {
        public static void main(String[] args) {
            GenericClass<Integer> intObj = new GenericClass<>();
            intObj.display(123);

            GenericClass<String> stringObj = new GenericClass<>();
            stringObj.display("Generic Interface Example");
        }
    }

