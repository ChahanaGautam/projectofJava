package mypackage;

class Animal{
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class SingleInheritanceExample {

        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.eat();  // Inherited from Animal
            dog.bark(); // Defined in Dog
        }
    }

