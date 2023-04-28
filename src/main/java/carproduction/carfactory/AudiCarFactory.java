package carproduction.carfactory;

import carproduction.carmodel.Car;
import carproduction.carmodel.CarModel;
import carproduction.carmodel.audimodel.AudiQ3;
import carproduction.carmodel.audimodel.AudiQ8;
import carproduction.carmodel.audimodel.AudiSQ5;

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
