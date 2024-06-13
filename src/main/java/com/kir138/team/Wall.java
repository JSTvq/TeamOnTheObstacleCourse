package com.kir138.team;

public class Wall implements Obstacle {
    private final int height;

    public Wall(final int height) {
        this.height = height;
    }

    @Override
    public void doIt(final Participant participant) {
        participant.jump(height);
    }
}
