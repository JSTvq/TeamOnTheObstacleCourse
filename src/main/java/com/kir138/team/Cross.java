package com.kir138.team;

public class Cross implements Obstacle {
    private final int distance;

    public Cross(final int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(final Participant participant) {
        participant.run(distance);
    }
}
