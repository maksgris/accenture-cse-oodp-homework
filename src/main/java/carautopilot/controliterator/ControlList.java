package carautopilot.controliterator;

import java.util.List;

import static carautopilot.controliterator.Controls.*;

public class ControlList implements ControlAggregator {

    private final List<Controls> listOfControls = List.of(LEFT, SPEED_UP, RIGHT, LEFT, SLOW_DOWN, SPEED_UP,
            RIGHT, SPEED_UP, RIGHT, SLOW_DOWN, LEFT, SLOW_DOWN, LEFT, SLOW_DOWN, RIGHT, RIGHT);

    @Override
    public Iterator getIterator() {
        return new ControlIterator();
    }

    private class ControlIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < listOfControls.size();
        }

        @Override
        public Controls next() {
            return listOfControls.get(index++);
        }
    }
}
