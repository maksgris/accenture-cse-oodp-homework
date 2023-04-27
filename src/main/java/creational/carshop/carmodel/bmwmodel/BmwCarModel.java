package creational.carshop.carmodel.bmwmodel;

import creational.carshop.Car;
import creational.carshop.CarBrand;

public interface BmwCarModel extends Car {

    @Override
    default CarBrand getCarBrand() {
        return CarBrand.BMW;
    }
}
