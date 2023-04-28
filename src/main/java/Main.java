import carautopilot.Autopilot;
import carautopilot.AutopilotCar;
import carautopilot.controliterator.ControlList;
import carautopilot.controliterator.Controls;
import carautopilot.controliterator.Iterator;
import carautopilot.controls.*;
import carproduction.carfactory.AbstractCarFactory;
import carproduction.carmodel.Car;
import carproduction.carmodel.CarBrand;
import carproduction.carmodel.CarModel;
import carservice.caranalyze.CarRangeCalculator;
import carservice.caranalyze.CarRangeMilesAdapter;
import carservice.caranalyze.CarRangeMilesCounter;
import carservice.carupkeep.CarMaintenance;
import carservice.carupkeep.CarMaintenanceProvider;
import carservice.carupkeep.carservices.PreventiveMaintenance;
import carservice.carupkeep.carservices.RepairService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*// 1. Creational Results
        printCreationalResults();

        // 2. Structural Results
        printStructuralResults();*/

        // 3. Behavioral Results
        printBehavioralResults();
    }

    private static void printCreationalResults() {

        final AbstractCarFactory teslaFactory = AbstractCarFactory.getCarFactory(CarBrand.TESLA);
        final AbstractCarFactory bmwFactory = AbstractCarFactory.getCarFactory(CarBrand.BMW);
        final AbstractCarFactory toyotaFactory = AbstractCarFactory.getCarFactory(CarBrand.TOYOTA);
        final AbstractCarFactory audiFactory = AbstractCarFactory.getCarFactory(CarBrand.AUDI);

        final List<Car> carShopList = new ArrayList<>();
        final Car teslaModelS = teslaFactory.makeCar(CarModel.MODEL_S);
        final Car bmwIX = bmwFactory.makeCar(CarModel.BMW_IX);
        final Car bmwXM = bmwFactory.makeCar(CarModel.BMW_XM);
        final Car toyotaCorolla = toyotaFactory.makeCar(CarModel.COROLLA);
        final Car toyotaMirai = toyotaFactory.makeCar(CarModel.MIRAI);
        final Car audiQ8 = audiFactory.makeCar(CarModel.AUDI_Q8);
        final Car audiSQ5 = audiFactory.makeCar(CarModel.SQ5);

        carShopList.add(teslaModelS);
        carShopList.add(bmwIX);
        carShopList.add(bmwXM);
        carShopList.add(toyotaCorolla);
        carShopList.add(toyotaMirai);
        carShopList.add(audiQ8);
        carShopList.add(audiSQ5);

        System.out.printf("%n--Abstract factory example--%n");
        for (Car car: carShopList) {
            System.out.println(car.getCarInfo());
        }
    }

    private static void printStructuralResults() {

        final AbstractCarFactory teslaFactory = AbstractCarFactory.getCarFactory(CarBrand.TESLA);
        final Car teslaModelS = teslaFactory.makeCar(CarModel.MODEL_S);

        final CarRangeMilesCounter carRangeMilesCounter = new CarRangeMilesCounter(teslaModelS.getCarRange());
        final CarRangeCalculator carRangeAdapter = new CarRangeMilesAdapter(carRangeMilesCounter);

        System.out.printf("--Adapter example--%n%s's range in miles is %,.1f mi and in kilometers is %,.1f km%n",
                teslaModelS.getCarModel(),
                carRangeAdapter.getCarRangeInKm(),
                carRangeAdapter.getCarRangeInMi());

        System.out.printf("%n--Decorator example--%n");
        CarMaintenance newServiceProvider = new CarMaintenanceProvider();
        newServiceProvider = new PreventiveMaintenance(newServiceProvider);
        newServiceProvider = new RepairService(newServiceProvider);
        System.out.println(newServiceProvider.availableServices());
    }

    private static void printBehavioralResults() {

        Autopilot autopilotCar = new AutopilotCar();
        AutopilotControl turnCarRight = new AutopilotControl(new TurnCarRight(autopilotCar), null);
        AutopilotControl turnCarLeft = new AutopilotControl(new TurnCarLeft(autopilotCar), null);
        AutopilotControl speedUpCar = new AutopilotControl(null, new SpeedUpCar(autopilotCar));
        AutopilotControl slowDownCar = new AutopilotControl(null, new SlowDownCar(autopilotCar));

        ControlList controlList = new ControlList();
        Iterator iterator = controlList.getIterator();

        System.out.printf("%n--Chain of Responsibility using Iterator example--%n");
        while (iterator.hasNext()) {
            Controls command = (Controls) iterator.next();
            switch (command) {
                case RIGHT: turnCarRight.changeDirection();
                case LEFT: turnCarLeft.changeDirection();
                case SPEED_UP: speedUpCar.changeSpeed();
                case SLOW_DOWN: slowDownCar.changeSpeed();
            }
        }
    }
}
