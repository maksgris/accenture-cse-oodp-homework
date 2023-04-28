package carproduction.carmodel.teslamodel;

import carproduction.carmodel.Car;
import carproduction.carmodel.CarBrand;

public interface TeslaCarModel extends Car {

    @Override
    default CarBrand getCarBrand() {
        return CarBrand.TESLA;
    }
}
