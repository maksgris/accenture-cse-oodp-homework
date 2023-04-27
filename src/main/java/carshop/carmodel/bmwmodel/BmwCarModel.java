package carshop.carmodel.bmwmodel;

import carshop.Car;
import carshop.carmodel.CarBrand;

public interface BmwCarModel extends Car {

    @Override
    default CarBrand getCarBrand() {
        return CarBrand.BMW;
    }
}
