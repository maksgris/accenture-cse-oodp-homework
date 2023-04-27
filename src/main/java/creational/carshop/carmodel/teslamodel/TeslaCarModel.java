package creational.carshop.carmodel.teslamodel;

import creational.carshop.Car;
import creational.carshop.CarBrand;

public interface TeslaCarModel extends Car {

    @Override
    default CarBrand getCarBrand() {
        return CarBrand.TESLA;
    }
}
