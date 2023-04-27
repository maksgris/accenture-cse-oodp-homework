package creational.carshop.carmodel.audimodel;

import creational.carshop.CarModel;

public class AudiQ8 implements AudiCarModel {
    @Override
    public CarModel getCarModel() {
        return CarModel.AUDI_Q8;
    }

    @Override
    public Double getCarPrice() {
        return 74400.0;
    }

    @Override
    public Double getCarRange() {
        return 285.0;
    }
}
