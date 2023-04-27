package carshop.carfactory;

import carshop.Car;
import carshop.carmodel.CarModel;
import carshop.carmodel.audimodel.AudiQ3;
import carshop.carmodel.audimodel.AudiQ8;
import carshop.carmodel.audimodel.AudiSQ5;

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
