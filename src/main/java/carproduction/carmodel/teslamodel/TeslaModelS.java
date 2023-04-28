package carproduction.carmodel.teslamodel;

import carproduction.carmodel.CarModel;

public class TeslaModelS implements TeslaCarModel {
    @Override
    public CarModel getCarModel() {
        return CarModel.MODEL_S;
    }

    @Override
    public Double getCarPrice() {
        return 87490.0;
    }

    @Override
    public Double getCarRange() {
        return 405.0;
    }
}
