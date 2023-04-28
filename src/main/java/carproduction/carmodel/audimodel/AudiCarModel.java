package carproduction.carmodel.audimodel;

import carproduction.carmodel.Car;
import carproduction.carmodel.CarBrand;

public interface AudiCarModel extends Car {

    @Override
    default CarBrand getCarBrand() {
        return CarBrand.AUDI;
    }
}
