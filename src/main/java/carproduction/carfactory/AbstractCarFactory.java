package carproduction.carfactory;

import carproduction.carmodel.Car;
import carproduction.carmodel.CarBrand;
import carproduction.carmodel.CarModel;

public interface AbstractCarFactory {

    Car makeCar(CarModel carModel);

    static AbstractCarFactory getCarFactory(CarBrand carBrand) {
        return switch (carBrand) {
            case TESLA -> new TeslaCarFactory();
            case BMW -> new BmwCarFactory();
            case TOYOTA -> new ToyotaCarFactory();
            case AUDI -> new AudiCarFactory();
            default -> throw new RuntimeException(String.format("Unknown car brand %s", carBrand.name()));
        };
    }
}
