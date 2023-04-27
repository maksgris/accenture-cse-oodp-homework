package creational.carshop.carfactory;

import creational.carshop.Car;
import creational.carshop.CarModel;
import creational.carshop.carmodel.audimodel.AudiQ3;
import creational.carshop.carmodel.audimodel.AudiQ8;
import creational.carshop.carmodel.audimodel.AudiSQ5;
import creational.carshop.carmodel.bmwmodel.BmwI7;
import creational.carshop.carmodel.bmwmodel.BmwIX;
import creational.carshop.carmodel.bmwmodel.BmwXM;

public class AudiCarFactory implements AbstractCarFactory {
    @Override
    public Car makeCar(CarModel carModel) {
        return switch (carModel) {
            case AUDI_Q8 -> new AudiQ8();
            case AUDI_Q3 -> new AudiQ3();
            case SQ5 -> new AudiSQ5();
            default -> throw new RuntimeException(String.format("Unknown Audi car model %s", carModel));
        };
    }
}
