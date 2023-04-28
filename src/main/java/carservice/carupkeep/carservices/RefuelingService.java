package carservice.carupkeep.carservices;

import carservice.carupkeep.CarMaintenance;

public class RefuelingService extends CarService {

    public RefuelingService(CarMaintenance carService) {
        super(carService);
    }

    @Override
    public String availableServices() {
        return carService.availableServices() + refuelCar();
    }

    private String refuelCar() {
        return String.format("%nCar refueling service");
    }
}
