package creational.carshop.carmodel.audimodel;

import creational.carshop.CarModel;

public class AudiSQ5 implements AudiCarModel {
    @Override
    public CarModel getCarModel() {
        return CarModel.SQ5;
    }

    @Override
    public Double getCarPrice() {
        return 56500.0;
    }

    @Override
    public Double getCarRange() {
        return 355.0;
    }
}
