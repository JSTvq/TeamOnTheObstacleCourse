package com.kir138.team.oop;

public class Course {
    private final Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    /**
     * Запуск полосы препятствий
     *
     * @param team - команда
     */
    public void doIt(Team team) {
        for (Participant participant : team.getParticipants()) {
            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(participant);
            }
        }
    }
}
