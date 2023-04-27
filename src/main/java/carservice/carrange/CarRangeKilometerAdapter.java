package carservice.carrange;

public class CarRangeKilometerAdapter implements CarRangeCalculator {

    private final CarRangeKilometerCounter carRangeKilometerCounter;

    public CarRangeKilometerAdapter(CarRangeKilometerCounter carRangeKilometerCounter) {
        this.carRangeKilometerCounter = carRangeKilometerCounter;
    }

    @Override
    public Double getCarRangeInKm() {
        return carRangeKilometerCounter.getCarRangeKm();
    }

    @Override
    public Double getCarRangeInMi() {
        return carRangeKilometerCounter.getCarRangeKm() * 0.62137;
    }
}
