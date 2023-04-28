package carservice.carupkeep.carservices;

import carservice.carupkeep.CarMaintenance;

public class RepairService extends CarService {

    public RepairService(CarMaintenance carService) {
        super(carService);
    }

    @Override
    public String availableServices() {
        return carService.availableServices() + repairCar();
    }

    private String repairCar() {
        return String.format("%nRepairing and/or replacing worn out components service");
    }
}
