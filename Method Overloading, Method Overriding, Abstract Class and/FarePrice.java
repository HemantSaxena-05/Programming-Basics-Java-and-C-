abstract class Vehicle {

    protected double baseFare;
    static double fuelSurcharge = 30;

    Vehicle(double baseFare) {
        this.baseFare = baseFare;
    }

    abstract void calculateFare(int distance);

    void vehicleType(String type) {
        System.out.println("Vehicle Type: " + type);
    }
}


class Bus extends Vehicle {

    Bus() {
        super(250);
    }

    void calculateFare(int distance) {

        double fare = baseFare;

        if (distance > 10) {
            fare = baseFare + (distance - 10) * 10;
        }

        if (distance > 15) {
            fare = fare + fuelSurcharge;
            System.out.println("Fuel surcharge applied.");
        }

        vehicleType("Bus");
        System.out.println("Distance Travelled: " + distance + " km");
        System.out.println("Final Fare: Rs " + fare);
        System.out.println();
    }
}


class Taxi extends Vehicle {

    Taxi() {
        super(50);
    }

    void calculateFare(int distance) {

        double fare = baseFare + (distance * 12);

        if (distance > 20) {
            fare = fare + 40;
            System.out.println("Night charge applied.");
        }

        vehicleType("Taxi");
        System.out.println("Distance Travelled: " + distance + " km");
        System.out.println("Final Fare: Rs " + fare);
        System.out.println();
    }
}

public class FarePrice {

    public static void main(String args[]) {

        Bus b = new Bus();
        Taxi t = new Taxi();
       
        b.calculateFare(8);    
        b.calculateFare(12);   
        b.calculateFare(18);  
    
        t.calculateFare(5);    
        t.calculateFare(25);  
    }
}