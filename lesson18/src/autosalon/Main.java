package autosalon;

import java.util.Arrays;

/**
 * Created by java on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Lanos(160, 10, Configuration.BASIC),
                new Lanos(170, 12, Configuration.LUX),
                new Mercedes(220, 15, Configuration.LUX),
                new Mercedes(180, 18, Configuration.BASIC),
                new Opel(220, 18, Configuration.EXCLUSIVE),
                new Opel(180, 18, Configuration.BASIC)
        };

        Autosalon autosalon = new Autosalon(cars);

        System.out.println("Total cars price: " + autosalon.calculateCarsPrice());
        System.out.println("Speed: " + Arrays.toString(autosalon.getCarsBySpeedRange(160, 170)));
        System.out.println("Fuel : " + Arrays.toString(autosalon.sortByFuelConsumption()));
    }

}
