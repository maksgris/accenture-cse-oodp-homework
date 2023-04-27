package carshop;

import carshop.carmodel.CarBrand;
import carshop.carmodel.CarModel;

public interface Car {

    CarBrand getCarBrand();

    CarModel getCarModel();

    Double getCarPrice();

    Double getCarRange();

    default String getCarInfo() {
        return String.format("- Car brand is %s%n- Car model is %s%n- Car price is $%,.2f%n- Car range is %,.1f miles%n",
                getCarBrand().toString(),
                getCarModel().toString(),
                getCarPrice(),
                getCarRange());
    }
}
