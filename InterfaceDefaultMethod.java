package Examples;

    interface Device {
        void powerOn();

        default void powerOff() {
            System.out.println("Device is powered off.");
        }
    }

    class Phone implements Device {
        public void powerOn() {
            System.out.println("Phone is powered on.");
        }
    }

    public class InterfaceDefaultMethod {
        public static void main(String[] args) {
            Phone phone = new Phone();
            phone.powerOn();
            phone.powerOff();
        }
    }


