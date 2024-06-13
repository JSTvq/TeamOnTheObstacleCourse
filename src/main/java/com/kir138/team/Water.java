package com.kir138.team;

public class Water implements Obstacle {
    private final int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(distance);
    }
}