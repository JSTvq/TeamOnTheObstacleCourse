package com.kir138.team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle...obstacles) {
        this.obstacles = obstacles;
    }

    //метод, который будет просить команду пройти всю полосу
    public void doIt(Team team) {
        for (Participant participant : team.showMass()) {
            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(participant);
                if (!((Human)participant).resetAll()) {
                    break;
                }
            }
        }
    }
}
