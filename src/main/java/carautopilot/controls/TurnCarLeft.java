package carautopilot.controls;

import carautopilot.Autopilot;

public class TurnCarLeft implements DirectionControl {

    private final Autopilot autopilotCar;

    public TurnCarLeft(Autopilot autopilotCar) {
        this.autopilotCar = autopilotCar;
    }

    @Override
    public void changeDirection() {
        autopilotCar.turnLeft();
    }
}
