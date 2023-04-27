package carshop.carmodel.bmwmodel;

import carshop.carmodel.CarModel;

public class BmwXM implements BmwCarModel {
    @Override
    public CarModel getCarModel() {
        return CarModel.BMW_XM;
    }

    @Override
    public Double getCarPrice() {
        return 148060.0;
    }

    @Override
    public Double getCarRange() {
        return 558.0;
    }
}
