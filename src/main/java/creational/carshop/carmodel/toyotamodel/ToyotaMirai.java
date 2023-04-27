package creational.carshop.carmodel.toyotamodel;

import creational.carshop.CarModel;

public class ToyotaMirai implements ToyotaCarModel {
    @Override
    public CarModel getCarModel() {
        return CarModel.MIRAI;
    }

    @Override
    public Double getCarPrice() {
        return 49500.0;
    }

    @Override
    public Double getCarRange() {
        return 276.0;
    }
}
