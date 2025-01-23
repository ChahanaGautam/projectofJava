package Examples;

    abstract class Vehicle{
        abstract void start();
        void fuelUp(){
            System.out.println("Filling Fuel....");
        }
    }
    class Car extends Vehicle{
        @Override
        void start(){
            System.out.println("Car Started");
        }
    }
    class Bus extends Vehicle{
        @Override
        void start(){
            System.out.println("Bus Started");
        }
    }
    public class Main{
        public static void main(String[ ] args){
            Car myCar = new Car();
            myCar.start();
            myCar.fuelUp();
            Bus myBus = new Bus();
            myBus.start();
            myBus.fuelUp();
        }
    }

