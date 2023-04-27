package creational.carshop.carmodel.teslamodel;

import creational.carshop.CarModel;

public class TeslaModelY implements TeslaCarModel {
    @Override
    public CarModel getCarModel() {
        return CarModel.MODEL_Y;
    }

    @Override
    public Double getCarPrice() {
        return 49990.0;
    }

    @Override
    public Double getCarRange() {
        return 330.0;
    }
}
