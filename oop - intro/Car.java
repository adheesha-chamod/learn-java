public class Car {
    private int speed;
    private int gasoline;
    private boolean engineState;

    // public static final int MAX_SPEED = 100;    // static public constant variable | normally constant variable is written in uppercase
    public static int MAX_SPEED = 100;              // static public variable
    /*
     * by default,
     *  - all classes are public in Java
     *  - all constructors are public in Java
     */
    public Car() {
        /* setting default values */

        /* don't use this method */
        // speed = 0;
        // gasoline = 0;
        // engineState = false;

        /* use this method */
        setSpeed(0);
        setGasoline(0);
        setEngineStatus(false);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }

    public void setEngineStatus(boolean isEngineOn) {
        this.engineState = isEngineOn;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getGasoline() {
        return this.gasoline;
    }

    public boolean getEngineStatus() {
        return this.engineState;
    }

    public boolean isViolateSpeedLimit() {
        return this.speed > MAX_SPEED;
    }
}
