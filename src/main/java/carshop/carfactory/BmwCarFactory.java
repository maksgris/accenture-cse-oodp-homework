package carshop.carfactory;

import carshop.Car;
import carshop.carmodel.bmwmodel.BmwI7;
import carshop.carmodel.bmwmodel.BmwXM;
import carshop.carmodel.CarModel;
import carshop.carmodel.bmwmodel.BmwIX;

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
