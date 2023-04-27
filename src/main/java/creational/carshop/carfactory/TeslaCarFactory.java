package creational.carshop.carfactory;

import creational.carshop.Car;
import creational.carshop.CarModel;
import creational.carshop.carmodel.teslamodel.TeslaModelS;
import creational.carshop.carmodel.teslamodel.TeslaModelY;

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
