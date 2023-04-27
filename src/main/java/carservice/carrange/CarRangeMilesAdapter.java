package carservice.carrange;

public class CarRangeMilesAdapter implements CarRangeCalculator {

    private final CarRangeMilesCounter carRangeMilesCounter;

    public CarRangeMilesAdapter(CarRangeMilesCounter carRangeMilesCounter) {
        this.carRangeMilesCounter = carRangeMilesCounter;
    }

    @Override
    public Double getCarRangeInKm() {
        return carRangeMilesCounter.getCarRangeMi() * 1.60934;
    }

    @Override
    public Double getCarRangeInMi() {
        return carRangeMilesCounter.getCarRangeMi();
    }
}
