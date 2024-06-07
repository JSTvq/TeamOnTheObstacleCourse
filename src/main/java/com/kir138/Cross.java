package com.kir138;

public class Cross extends Obstacle {
    private final int distance;

    public Cross(final int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(final Participant participant) {
        participant.run(distance);
    }
}
