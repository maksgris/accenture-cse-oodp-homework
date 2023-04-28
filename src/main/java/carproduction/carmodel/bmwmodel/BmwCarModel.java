package carproduction.carmodel.bmwmodel;

import carproduction.carmodel.Car;
import carproduction.carmodel.CarBrand;

public interface BmwCarModel extends Car {

    @Override
    default CarBrand getCarBrand() {
        return CarBrand.BMW;
    }
}
