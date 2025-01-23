package Exception;


    class InvalidAgeException extends Exception{
        public InvalidAgeException(String message){
            super(message);
        }
    }
    class UserRegistration{
        public static void registerUser(String name, int age) throws InvalidAgeException{
            if(age<18){
                throw new InvalidAgeException("Age must be at least 18 for register.");
            }
            System.out.println("User"+ name + "registered successfully.");
        }

        public static void main(String[]args){

            try{
                registerUser("Alice",16);
            }
            catch(InvalidAgeException e){
        System.out.println("Error:"+e.getMessage());
            }
        }
    }

