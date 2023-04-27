package carshop.carmodel.toyotamodel;

import carshop.Car;
import carshop.carmodel.CarBrand;

public interface ToyotaCarModel extends Car {

    @Override
    default CarBrand getCarBrand() {
        return CarBrand.BMW;
    }
}
