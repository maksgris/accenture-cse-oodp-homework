package creational.carshop.carmodel.toyotamodel;

import creational.carshop.Car;
import creational.carshop.CarBrand;

public interface ToyotaCarModel extends Car {

    @Override
    default CarBrand getCarBrand() {
        return CarBrand.BMW;
    }
}
