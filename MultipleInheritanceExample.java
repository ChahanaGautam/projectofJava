package mypackage;
 interface CanRun{
     void run();
 }
 interface CanSwim{
     void swim();
 }
 class Labrador extends Dog implements CanRun,CanSwim{
     public void run(){
         System.out.println("The labrador run fast.");
     }

     public void swim(){
         System.out.println("The labrador swims well.");
     }
 }
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Labrador lab = new Labrador();
        lab.eat(); // Inherited from Animal
        lab.bark(); //Inherited from Dog
        lab.run(); //from CanRun
        lab.swim(); //from CanSwim
    }
}
