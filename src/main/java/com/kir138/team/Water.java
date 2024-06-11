package com.kir138.team;

import com.kir138.team.Obstacle;
import com.kir138.team.Participant;

public class Water extends Obstacle {
    private final int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(distance);
    }
}