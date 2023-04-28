package carproduction.carmodel.toyotamodel;

import carproduction.carmodel.Car;
import carproduction.carmodel.CarBrand;

public interface ToyotaCarModel extends Car {

    @Override
    default CarBrand getCarBrand() {
        return CarBrand.BMW;
    }
}
