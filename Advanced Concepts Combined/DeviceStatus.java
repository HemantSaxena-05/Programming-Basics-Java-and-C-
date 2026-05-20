interface RemoteControl {
    void powerOn();
    void powerOff();
    void displayStatus();
}

class TV implements RemoteControl {
    boolean isOn = false;

    public void powerOn() {
        isOn = true;
        System.out.println("TV turned ON");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("TV turned OFF");
    }

    public void displayStatus() {
        System.out.println("TV Status: " + (isOn ? "ON" : "OFF"));
    }
}

class AC implements RemoteControl {
    boolean isOn = false;

    public void powerOn() {
        isOn = true;
        System.out.println("AC turned ON");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("AC turned OFF");
    }

    public void displayStatus() {
        System.out.println("AC Status: " + (isOn ? "ON" : "OFF"));
    }
}

public class DeviceStatus {
    public static void main(String[] args) {

        TV tv = new TV();
        AC ac = new AC();

        tv.displayStatus();
        tv.powerOn();
        tv.displayStatus();
        tv.powerOff();
        tv.displayStatus();

        System.out.println();

        ac.displayStatus();
        ac.powerOn();
        ac.displayStatus();
        ac.powerOff();
        ac.displayStatus();
    }
}