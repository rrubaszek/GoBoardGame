package org.server;

public class Stone {
    private StoneColor color;
    private IntersectionState intersectionState;

    public Stone() {
        this.color = null;
        this.intersectionState = IntersectionState.EMPTY;
    }

    public void placeStone(StoneColor color) {
        if (intersectionState == IntersectionState.EMPTY) {
            this.color = color;
            this.intersectionState = IntersectionState.OCCUPIED;
        } else {
            throw new IllegalStateException("The intersection is already occupied.");
        }
    }

    public StoneColor getColor() {
        return color;
    }

    public IntersectionState getState() {
        return intersectionState;
    }

    public void removeStone() {
        if (intersectionState == IntersectionState.OCCUPIED) {
            this.color = null;
            this.intersectionState = IntersectionState.EMPTY;
        } else {
            throw new IllegalStateException("No stone to remove at this intersection.");
        }
    }
}