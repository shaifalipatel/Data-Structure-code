package design_pattern.FactoryDesign;

public abstract class Vehicle {

    public abstract int getWheel();

    @Override
    public String toString() {
        return "Wheel" + this.getWheel();
    }
}

class Car extends Vehicle {

    int wheel;

    Car(int wheel) {
        this.wheel = wheel;
    }

    /**
     * @return
     */
    @Override
    public int getWheel() {
        return wheel;
    }
}

class Bike extends Vehicle {

    int wheel;

    Bike(int wheel) {
        this.wheel = wheel;
    }

    /**
     * @return
     */
    @Override
    public int getWheel() {
        return wheel;
    }
}

class Vehiclefactory{

}

