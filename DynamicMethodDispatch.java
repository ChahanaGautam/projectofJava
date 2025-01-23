package mypackage;
class Animal3 {
    void sound() {
        System.out.println("Some generic animal sound.");
    }
}

class Dog3 extends Animal3 {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Animal3 animal = new Dog3(); // Upcasting
        animal.sound(); // Calls Dog's overridden method

    }
}
