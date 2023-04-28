package carautopilot;

import java.util.Locale;

public class AutopilotCar implements Autopilot {

    private Speed carSpeed = Speed.HALT;
    private Direction carDirection = Direction.FORWARD;

    @Override
    public void speedUp() {
        switch (carSpeed) {
            case HALT -> carSpeed = Speed.SLOW;
            case SLOW -> carSpeed = Speed.MEDIUM;
            case MEDIUM, FAST -> carSpeed = Speed.FAST;
        }
        System.out.printf("Car speeds up, current speed is %s!%n", carSpeed.toString().toLowerCase(Locale.ROOT));
    }

    @Override
    public void speedDown() {
        switch (carSpeed) {
            case HALT, SLOW -> carSpeed = Speed.HALT;
            case MEDIUM -> carSpeed = Speed.SLOW;
            case FAST -> carSpeed = Speed.MEDIUM;
        }
        System.out.printf("Car slows down, current speed is %s!%n", carSpeed.toString().toLowerCase(Locale.ROOT));
    }

    @Override
    public void turnRight() {
        switch (carDirection) {
            case LEFT -> carDirection = Direction.FORWARD;
            case RIGHT, FORWARD -> carDirection = Direction.RIGHT;
        }
        System.out.printf("Car turning right, current direction is %s!%n", carDirection.toString().toLowerCase(Locale.ROOT));
    }

    @Override
    public void turnLeft() {
        switch (carDirection) {
            case RIGHT -> carDirection = Direction.FORWARD;
            case LEFT, FORWARD -> carDirection = Direction.LEFT;
        }
        System.out.printf("Car turning left, current direction is %s!%n", carDirection.toString().toLowerCase(Locale.ROOT));
    }
}
