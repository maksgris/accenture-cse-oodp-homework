package creational.carshop.carmodel.toyotamodel;

import creational.carshop.CarModel;

public class ToyotaGR86 implements ToyotaCarModel {
    @Override
    public CarModel getCarModel() {
        return CarModel.GR86;
    }

    @Override
    public Double getCarPrice() {
        return 28400.0;
    }

    @Override
    public Double getCarRange() {
        return 270.0;
    }
}
