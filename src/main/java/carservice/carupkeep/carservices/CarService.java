package carservice.carupkeep.carservices;

import carservice.carupkeep.CarMaintenance;

public abstract class CarService implements CarMaintenance {

    protected CarMaintenance carService;

    public CarService(CarMaintenance carService) {
        this.carService = carService;
    }
}
