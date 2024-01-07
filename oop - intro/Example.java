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
        System.out.println("Max speed: " + Car.MAX_SPEED + "\n");

        // int[] arr = new int[1, 2, 3, 4, 5];      // error
        // Car[] cars = new Car[car1, car2];        // error

        // int[] arr = {1, 2, 3, 4, 5};             // correct
        // Car[] cars = {car1, car2};               // correct

        // int[] arr = new int[]{1, 2, 3, 4, 5};    // correct
        Car[] cars = new Car[]{car1, car2};         // correct

        for(Car car : cars) {
            String carName = "Car 1";

            if(car == car2) {
                carName = "Car 2";
            }

            System.out.println(carName + " Speed: " + car.getSpeed());
            System.out.println(carName + " Gasoline: " + car.getGasoline());
            System.out.println(carName + " Is engine on: " + car.getEngineStatus());
            System.out.println(carName + " Is violate speed limit: " + car.isViolateSpeedLimit() + "\n");

            /*
             * instead of println, we can use printf like in C
             * %s: string
             * %d: integer
             * %f: float
             * %b: boolean
             * %c: char
             * %n: new line
             * ...
             */
        }        

        Car.MAX_SPEED = 250;
        System.out.println("Now, max speed: " + Car.MAX_SPEED);
        System.out.println("Now, Car 1 Is violate speed limit: " + car1.isViolateSpeedLimit());
    }    
}
