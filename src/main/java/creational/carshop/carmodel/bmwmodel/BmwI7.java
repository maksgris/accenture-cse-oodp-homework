package creational.carshop.carmodel.bmwmodel;

import creational.carshop.CarModel;

public class BmwI7 implements BmwCarModel {
    @Override
    public CarModel getCarModel() {
        return CarModel.BMW_I7;
    }

    @Override
    public Double getCarPrice() {
        return 110545.0;
    }

    @Override
    public Double getCarRange() {
        return 387.0;
    }
}
