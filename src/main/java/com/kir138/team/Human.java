package com.kir138.team;

public class Human implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;
    private boolean res;

    public Human(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.res = true;
    }


    public boolean resetAll() {
        return res;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {
        if (distance > maxRunDistance) {
            res = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > maxSwimDistance) {
            res = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height > maxJumpHeight) {
            res = false;
        }
    }
}