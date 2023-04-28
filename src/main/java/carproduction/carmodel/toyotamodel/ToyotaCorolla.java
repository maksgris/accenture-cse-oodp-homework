package carproduction.carmodel.toyotamodel;

import carproduction.carmodel.CarModel;

public class ToyotaCorolla implements ToyotaCarModel {
    @Override
    public CarModel getCarModel() {
        return CarModel.COROLLA;
    }

    @Override
    public Double getCarPrice() {
        return 21550.0;
    }

    @Override
    public Double getCarRange() {
        return 232.0;
    }
}
