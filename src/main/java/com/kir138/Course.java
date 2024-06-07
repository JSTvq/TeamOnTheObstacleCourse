package com.kir138;

public class Course {
    private Obstacle[] mass;

    public Course(Obstacle...mass) {
        this.mass = mass;
    }

    //метод, который будет просить команду пройти всю полосу
    public void doIt(Team team) {
        for (Participant p : team.showAllMembersTeam()) {
            for (Obstacle o : mass) {
                o.doIt(p);
                if ((Human)p.reset()) {

                }
            }
        }
    }


}
