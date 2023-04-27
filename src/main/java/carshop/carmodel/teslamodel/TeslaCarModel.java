package carshop.carmodel.teslamodel;

import carshop.Car;
import carshop.carmodel.CarBrand;

public interface TeslaCarModel extends Car {

    @Override
    default CarBrand getCarBrand() {
        return CarBrand.TESLA;
    }
}
