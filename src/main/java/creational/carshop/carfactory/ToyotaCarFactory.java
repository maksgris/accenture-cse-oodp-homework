package creational.carshop.carfactory;

import creational.carshop.Car;
import creational.carshop.CarModel;
import creational.carshop.carmodel.bmwmodel.BmwI7;
import creational.carshop.carmodel.bmwmodel.BmwIX;
import creational.carshop.carmodel.bmwmodel.BmwXM;
import creational.carshop.carmodel.toyotamodel.ToyotaCorolla;
import creational.carshop.carmodel.toyotamodel.ToyotaGR86;
import creational.carshop.carmodel.toyotamodel.ToyotaMirai;

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
