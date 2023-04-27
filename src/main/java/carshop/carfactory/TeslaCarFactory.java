package carshop.carfactory;

import carshop.Car;
import carshop.carmodel.CarModel;
import carshop.carmodel.teslamodel.TeslaModelS;
import carshop.carmodel.teslamodel.TeslaModelY;

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
