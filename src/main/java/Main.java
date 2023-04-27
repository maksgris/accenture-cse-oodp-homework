import creational.carshop.Car;
import creational.carshop.CarBrand;
import creational.carshop.CarModel;
import creational.carshop.carfactory.AbstractCarFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * 1. creational task
         */

        printCreationalResults();

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
}
