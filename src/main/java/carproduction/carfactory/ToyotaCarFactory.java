package carproduction.carfactory;

import carproduction.carmodel.Car;
import carproduction.carmodel.CarModel;
import carproduction.carmodel.toyotamodel.ToyotaCorolla;
import carproduction.carmodel.toyotamodel.ToyotaGR86;
import carproduction.carmodel.toyotamodel.ToyotaMirai;

public class ToyotaCarFactory implements AbstractCarFactory {
    @Override
    public Car makeCar(CarModel carModel) {
        return switch (carModel) {
            case COROLLA -> new ToyotaCorolla();
            case GR86 -> new ToyotaGR86();
            case MIRAI -> new ToyotaMirai();
            default -> throw new RuntimeException(String.format("Unknown Toyota car model %s", carModel));
        };
    }
}
