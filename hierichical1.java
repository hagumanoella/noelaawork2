class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.drive();
        myCar.stop();

        Motorcycle myMotorcycle = new Motorcycle();
        myMotorcycle.start();
        myMotorcycle.accelerate();
        myMotorcycle.stop();

        Bicycle myBicycle = new Bicycle();
        myBicycle.start();
        myBicycle.pedal();
        myBicycle.stop();
    }
}
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven...");
    }
}

class Motorcycle extends Vehicle {
    void accelerate() {
        System.out.println("Motorcycle is accelerating...");
    }
}
class Bicycle extends Vehicle {
    void pedal() {
        System.out.println("Bicycle is being pedaled...");
    }
}

 