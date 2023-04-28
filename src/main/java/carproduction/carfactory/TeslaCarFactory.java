package carproduction.carfactory;

import carproduction.carmodel.Car;
import carproduction.carmodel.CarModel;
import carproduction.carmodel.teslamodel.TeslaModelS;
import carproduction.carmodel.teslamodel.TeslaModelY;

public class TeslaCarFactory implements AbstractCarFactory {
    @Override
    public Car makeCar(CarModel carModel) {
        return switch (carModel) {
            case MODEL_S -> new TeslaModelS();
            case MODEL_Y -> new TeslaModelY();
            default -> throw new RuntimeException(String.format("Unknown Tesla car model %s", carModel));
        };
    }
}
