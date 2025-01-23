package mypackage;
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

public class MultilevelInheritance {
            public static void main(String[] args) {
            Puppy puppy = new Puppy();
            puppy.eat();  // Inherited from Animal
            puppy.bark(); // Inherited from Dog
            puppy.weep(); // Defined in Puppy
        }
    }

