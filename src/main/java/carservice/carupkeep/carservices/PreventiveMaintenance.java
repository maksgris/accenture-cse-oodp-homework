package carservice.carupkeep.carservices;

import carservice.carupkeep.CarMaintenance;

public class PreventiveMaintenance extends CarService {

    public PreventiveMaintenance(CarMaintenance carService) {
        super(carService);
    }

    @Override
    public String availableServices() {
        return carService.availableServices() + testCar();
    }

    private String testCar() {
        return String.format("%nDay-to-day building checks" +
                "%nCar component inspection service" +
                "%nCar component testing service");
    }
}
