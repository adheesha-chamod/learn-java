public class Example {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        
        car1.setSpeed(200);
        car1.setGasoline(500);
        car1.setEngineStatus(true);

        car2.setSpeed(0);
        car2.setGasoline(100);
        car2.setEngineStatus(false);

        /*
         * static variable can be accessed without creating an object
         * Since it is not belong to any object, it is belong to the class
         * So, accessing static variable from an object is not recommended (it is possible, but not recommended)
         * In this case, it is public, so it can be accessed from outside the class
         */
        System.out.println("Max speed: " + Car.MAX_SPEED);
        
        System.out.println("Car 1 Speed: " + car1.getSpeed());
        System.out.println("Car 1 Gasoline: " + car1.getGasoline());
        System.out.println("Car 1 Is engine on: " + car1.getEngineStatus());
        System.out.println("Car 1 Is violate speed limit: " + car1.isViolateSpeedLimit());

        System.out.println("Car 2 Speed: " + car2.getSpeed());
        System.out.println("Car 2 Gasoline: " + car2.getGasoline());
        System.out.println("Car 2 Is engine on: " + car2.getEngineStatus());
        System.out.println("Car 2 Is violate speed limit: " + car2.isViolateSpeedLimit());

        Car.MAX_SPEED = 250;
        System.out.println("Now, max speed: " + Car.MAX_SPEED);
        System.out.println("Now, Car 1 Is violate speed limit: " + car1.isViolateSpeedLimit());
    }    
}
