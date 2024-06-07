package com.kir138;

import java.util.Arrays;

public class Team {
    private String nameTeam;
    private Participant[] members;

    public Team(String nameTeam, Participant...members) {
        this.nameTeam = nameTeam;
        this.members = members;
    }

    //метод для вывода информации о членах команды, прошедших дистанцию

    //метод вывода информации обо всех членах команды
    public Participant[] showAllMembersTeam() {
        return members;
    }

    @Override
    public String toString() {
        return "Team{" +
                "nameTeam='" + nameTeam + '\'' +
                ", members=" + Arrays.toString(members) +
                '}';
    }
}
