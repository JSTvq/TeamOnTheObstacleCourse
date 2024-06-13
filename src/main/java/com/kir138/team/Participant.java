package com.kir138.team;

public abstract class Participant {

    protected final String name;
    protected final int maxRunDistance;
    protected final int maxJumpHeight;
    protected final int maxSwimDistance;

    public Participant(String name,
                       int maxRunDistance,
                       int maxJumpHeight,
                       int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
    }

    abstract void run(int distance);

    abstract void swim(int distance);

    abstract void jump(int height);

    abstract boolean getIsSuccessful();

    abstract String getName();

}
