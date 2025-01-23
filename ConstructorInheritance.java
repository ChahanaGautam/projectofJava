package Examples;


    class Parent {
        Parent() {
            System.out.println("Parent constructor called.");
        }
    }

    class Child extends Parent {
        Child() {
            System.out.println("Child constructor called.");
        }
    }

    public class ConstructorInheritance {
        public static void main(String[] args) {
            Child child = new Child();
        }
    }


