package OOP;

public class SUV extends Car{

    @Override
    void autopilot() {
        System.out.println("SUV Autopilot");
    }

    @Override
    void streamingServices() {
        System.out.println("SUV Streaming Services");
    }

    @Override
    void parkingSensors() {
        System.out.println("SUV Parking Sensors");
    }
}
