package Autosalon;

/**
 * Created by java on 13.01.2017.
 */
public abstract class Car {

    private int msxSpeed;
    private double fuelConsumption;
    private Configuration configuration;

    public Car(int msxSpeed, double fuelConsumption, Configuration configuration) {
        this.msxSpeed = msxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.configuration = configuration;
    }



    public int getMsxSpeed() {
        return msxSpeed;
    }

    public void setMsxSpeed(int msxSpeed) {
        this.msxSpeed = msxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
}
