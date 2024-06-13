package com.kir138.team.oop;

public class Human extends Participant {
    private boolean isSuccessful;

    public Human(String name,
                 int maxRunDistance,
                 int maxJumpHeight,
                 int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance);
        this.isSuccessful = true;
    }

    @Override
    public boolean getIsSuccessful() {
        return isSuccessful;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {
        if (distance > maxRunDistance) {
            isSuccessful = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > maxSwimDistance) {
            isSuccessful = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height > maxJumpHeight) {
            isSuccessful = false;
        }
    }
}