package creational.carshop.carmodel.audimodel;

import creational.carshop.Car;
import creational.carshop.CarBrand;

public interface AudiCarModel extends Car {

    @Override
    default CarBrand getCarBrand() {
        return CarBrand.AUDI;
    }
}
