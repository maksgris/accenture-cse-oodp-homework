package carshop.carfactory;

import carshop.Car;
import carshop.carmodel.CarModel;
import carshop.carmodel.toyotamodel.ToyotaCorolla;
import carshop.carmodel.toyotamodel.ToyotaGR86;
import carshop.carmodel.toyotamodel.ToyotaMirai;

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
