package creational.carshop.carmodel.bmwmodel;

import creational.carshop.CarModel;

public class BmwIX implements BmwCarModel {
    @Override
    public CarModel getCarModel() {
        return CarModel.BMW_IX;
    }

    @Override
    public Double getCarPrice() {
        return 69905.0;
    }

    @Override
    public Double getCarRange() {
        return 262.0;
    }
}
