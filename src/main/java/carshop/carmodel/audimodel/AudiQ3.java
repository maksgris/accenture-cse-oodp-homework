package carshop.carmodel.audimodel;

import carshop.carmodel.CarModel;

public class AudiQ3 implements AudiCarModel {
    @Override
    public CarModel getCarModel() {
        return CarModel.AUDI_Q3;
    }

    @Override
    public Double getCarPrice() {
        return 39200.0;
    }

    @Override
    public Double getCarRange() {
        return 250.0;
    }
}
