package carautopilot.controls;

import carautopilot.Autopilot;

public class TurnCarRight implements DirectionControl {

    private final Autopilot autopilotCar;

    public TurnCarRight(Autopilot autopilotCar) {
        this.autopilotCar = autopilotCar;
    }

    @Override
    public void changeDirection() {
        autopilotCar.turnRight();
    }
}
