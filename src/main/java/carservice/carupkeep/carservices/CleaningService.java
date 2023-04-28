package carservice.carupkeep.carservices;

import carservice.carupkeep.CarMaintenance;

public class CleaningService extends CarService {

    public CleaningService(CarMaintenance carService) {
        super(carService);
    }

    @Override
    public String availableServices() {
        return carService.availableServices() + cleanCar();
    }

    private String cleanCar() {
        return String.format("%nCar exterior cleaning service%nCar interior cleaning service");
    }
}
