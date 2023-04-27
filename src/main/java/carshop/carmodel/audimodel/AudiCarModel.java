package carshop.carmodel.audimodel;

import carshop.Car;
import carshop.carmodel.CarBrand;

public interface AudiCarModel extends Car {

    @Override
    default CarBrand getCarBrand() {
        return CarBrand.AUDI;
    }
}
