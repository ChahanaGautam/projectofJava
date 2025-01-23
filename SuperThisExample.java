package mypackage;

class Animal1 {
    String name = "Animal";

    void sound() {
        System.out.println("This is an animal.");
    }
}

class Dog1 extends Animal1 {
    String name = "Dog";

    void display() {
        System.out.println("Name from Dog class: " + this.name);
        System.out.println("Name from Animal class: " + super.name);
    }

    void sound() {
        super.sound(); // Call parent class method
        System.out.println("The dog barks.");
    }
}


public class SuperThisExample {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.display();
        dog.sound();
    }
}
