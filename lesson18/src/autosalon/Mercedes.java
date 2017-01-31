package autosalon;

/**
 * Created by java on 13.01.2017.
 */
public class Mercedes extends Car {

    public Mercedes(int maxSpeed, double fuelConsumption, Configuration configuration) {
        super(maxSpeed, fuelConsumption, configuration);
    }

    @Override
    public double getPrice() {
        switch (getConfiguration()){
            case LUX:
                return 10_000;
            case EXCLUSIVE:
                return 16_000;
            default:
                return 6_000;
        }
    }
}
