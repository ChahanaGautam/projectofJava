package Examples;


    class Animal {
        void sound() {
            System.out.println("Animals make sounds.");
        }
    }

    class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows.");
        }
    }

    public class MethodOverriding {
        public static void main(String[] args) {
            Animal myAnimal = new Cat();
            myAnimal.sound();
        }
    }


