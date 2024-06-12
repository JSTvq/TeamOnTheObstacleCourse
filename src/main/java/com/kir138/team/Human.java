package com.kir138.team;

public class Human implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;
    private boolean isSuccessful;

    public Human(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.isSuccessful = true;
    }

    public boolean resetAll() {
        return isSuccessful;
    }

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