package Day_9;

interface SmartDevice {
    void turnOn();
    void turnOff();
}
class Fan implements SmartDevice {

    public void turnOn() {
        System.out.println("Fan is ON - Rotating...");
    }

    public void turnOff() {
        System.out.println("Fan is OFF - Stopped.");
    }
}
class Light implements SmartDevice {

    public void turnOn() {
        System.out.println("Light is ON - Brightening...");
    }

    public void turnOff() {
        System.out.println("Light is OFF - Dark.");
    }
}
class AirConditioner implements SmartDevice {

    public void turnOn() {
        System.out.println("AC is ON - Cooling started...");
    }

    public void turnOff() {
        System.out.println("AC is OFF - Cooling stopped.");
    }
}
public class Task_3{
    public static void main(String[] args) {

        SmartDevice fan = new Fan();
        SmartDevice light = new Light();
        SmartDevice ac = new AirConditioner();

        fan.turnOn();
        fan.turnOff();

        System.out.println();

        light.turnOn();
        light.turnOff();

        System.out.println();

        ac.turnOn();
        ac.turnOff();
    }
}


