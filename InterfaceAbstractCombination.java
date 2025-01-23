package Examples;
    interface Flyer {
        void fly();
    }

    abstract class Bird {
        void eat() {
            System.out.println("Bird eats food.");
        }
    }

    class Sparrow extends Bird implements Flyer {
        public void fly() {
            System.out.println("Sparrow flies in the sky.");
        }
    }

    public class InterfaceAbstractCombination {
        public static void main(String[] args) {
            Sparrow sparrow = new Sparrow();
            sparrow.eat();
            sparrow.fly();
        }
    }


