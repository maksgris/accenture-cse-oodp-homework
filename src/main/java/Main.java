import carservice.carrange.CarRangeCalculator;
import carservice.carrange.CarRangeMilesAdapter;
import carservice.carrange.CarRangeMilesCounter;
import carshop.Car;
import carshop.carmodel.CarBrand;
import carshop.carmodel.CarModel;
import carshop.carfactory.AbstractCarFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Creational Results
        printCreationalResults();

        // 2. Structural Results
        printStructuralResults();
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

        for (Car car: carShopList) {
            System.out.println(car.getCarInfo());
        }
    }

    private static void printStructuralResults() {

        final AbstractCarFactory teslaFactory = AbstractCarFactory.getCarFactory(CarBrand.TESLA);
        final Car teslaModelS = teslaFactory.makeCar(CarModel.MODEL_S);

        final CarRangeMilesCounter carRangeMilesCounter = new CarRangeMilesCounter(teslaModelS.getCarRange());
        final CarRangeCalculator carRangeAdapter = new CarRangeMilesAdapter(carRangeMilesCounter);

        System.out.printf("%s's range in miles is %,.1f mi and in kilometers is %,.1f km%n",
                teslaModelS.getCarModel(),
                carRangeAdapter.getCarRangeInKm(),
                carRangeAdapter.getCarRangeInMi());
    }
}
