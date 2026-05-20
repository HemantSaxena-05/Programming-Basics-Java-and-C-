
class Appliance {
    void powerConsumption() {
        System.out.println("Calculating cost...");
    }
}


class Fan extends Appliance {
    void powerConsumption() {
        int unitCost = 10;
        int hours = 12;
        int cost = unitCost * hours;

        System.out.println("Fan runs for " + hours + " hours. Cost of running Fan is: " + cost);
    }
}


class AC extends Appliance {
    void powerConsumption() {
        int unitCost = 20;
        int hours = 6;
        int cost = unitCost * hours;

        System.out.println("AC runs for " + hours + " hours. Cost of running AC is: " + cost);
    }
}


class Heater extends Appliance {
    void powerConsumption() {
        int unitCost = 30;
        int hours = 4;
        int cost = unitCost * hours;

        System.out.println("Heater runs for " + hours + " hours. Cost of running Heater is: " + cost);
    }
}


public class ApplianceUseCost {
    public static void main(String[] args) {

        Appliance[] appliances = new Appliance[3];

        appliances[0] = new Fan();
        appliances[1] = new AC();
        appliances[2] = new Heater();

        for (Appliance a : appliances) {
            a.powerConsumption();  
        }
    }
}