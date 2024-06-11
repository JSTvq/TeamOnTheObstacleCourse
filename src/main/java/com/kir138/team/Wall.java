package com.kir138.team;

import com.kir138.team.Obstacle;
import com.kir138.team.Participant;

public class Wall extends Obstacle {
    private final int height;

    public Wall(final int height) {
        this.height = height;
    }

    @Override
    public void doIt(final Participant participant) {
        participant.jump(height);
    }
}
