package creational.carshop.carfactory;

import creational.carshop.Car;
import creational.carshop.CarModel;
import creational.carshop.carmodel.bmwmodel.BmwI7;
import creational.carshop.carmodel.bmwmodel.BmwIX;
import creational.carshop.carmodel.bmwmodel.BmwXM;
import creational.carshop.carmodel.teslamodel.TeslaModelS;
import creational.carshop.carmodel.teslamodel.TeslaModelY;

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
