package carproduction.carfactory;

import carproduction.carmodel.Car;
import carproduction.carmodel.bmwmodel.BmwI7;
import carproduction.carmodel.bmwmodel.BmwXM;
import carproduction.carmodel.CarModel;
import carproduction.carmodel.bmwmodel.BmwIX;

public class BmwCarFactory implements AbstractCarFactory {
    @Override
    public Car makeCar(CarModel carModel) {
        return switch (carModel) {
            case BMW_IX -> new BmwIX();
            case BMW_I7 -> new BmwI7();
            case BMW_XM -> new BmwXM();
            default -> throw new RuntimeException(String.format("Unknown BMW car model %s", carModel));
        };
    }
}
