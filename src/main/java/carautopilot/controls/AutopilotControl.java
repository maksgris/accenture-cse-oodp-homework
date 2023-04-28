package carautopilot.controls;

public class AutopilotControl {

    private final DirectionControl directionControl;
    private final SpeedControl speedControl;

    public AutopilotControl(DirectionControl directionControl, SpeedControl speedControl) {
        this.directionControl = directionControl;
        this.speedControl = speedControl;
    }
    public AutopilotControl(DirectionControl directionControl) {
        this.directionControl = directionControl;
        this.speedControl = null;
    }

    public AutopilotControl(SpeedControl speedControl) {
        this.directionControl = null;
        this.speedControl = speedControl;
    }

    public void changeDirection() {
        assert directionControl != null;
        directionControl.changeDirection();
    }

    public void changeSpeed() {
        assert speedControl != null;
        speedControl.changeSpeed();
    }
}
