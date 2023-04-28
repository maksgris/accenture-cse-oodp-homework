package carautopilot.controls;

import carautopilot.Autopilot;

public class SlowDownCar implements SpeedControl {

    private final Autopilot autopilotCar;

    public SlowDownCar(Autopilot autopilotCar) {
        this.autopilotCar = autopilotCar;
    }

    @Override
    public void changeSpeed() {
        autopilotCar.speedDown();
    }
}
