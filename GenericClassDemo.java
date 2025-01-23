
    public class GenericClassDemo<T> {
        private T data;

        public GenericClassDemo(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public static void main(String[] args) {
            GenericClassDemo<Integer> intObj = new GenericClassDemo<>(10);
            GenericClassDemo<String> stringObj = new GenericClassDemo<>("Generics in Java");

            System.out.println("Integer Data: " + intObj.getData());
            System.out.println("String Data: " + stringObj.getData());
        }
    }

