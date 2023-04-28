package carautopilot.controls;

import carautopilot.Autopilot;

public class SpeedUpCar implements SpeedControl {

    private final Autopilot autopilotCar;

    public SpeedUpCar(Autopilot autopilotCar) {
        this.autopilotCar = autopilotCar;
    }

    @Override
    public void changeSpeed() {
        autopilotCar.speedUp();
    }
}
