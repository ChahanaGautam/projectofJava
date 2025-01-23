package mypackage;
class Animal2{
    Animal2() {
        System.out.println("Animal constructor called.");
    }
}

class Dog2 extends Animal {
    Dog2() {
        super(); // Calls parent class constructor
        System.out.println("Dog constructor called.");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();

    }
}
