abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

interface GPS {
    void navigate();
}

class Car extends Vehicle implements GPS {
    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    public void navigate() {
        System.out.println("Navigation started");
    }
}

public class AbstractionAndInterface {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.navigate();
        car.stop();
    }
}
