package com.kir138.team;

import com.kir138.team.Participant;

import java.util.Arrays;

public class Team {
    private String nameTeam;
    private Participant[] members;

    public Team(String nameTeam, Participant...members) {
        this.nameTeam = nameTeam;
        this.members = members;
    }

    //метод для вывода информации о членах команды, прошедших дистанцию
    public void showAllMembersTeam() {
        for (Participant participant : members) {
            Human human = (Human) participant;
            if (human.resetAll()) {
                System.out.println(human.getName());
            }
        }
    }

    //метод вывода информации обо всех членах команды
    public void showAll() {
        StringBuilder sb = new StringBuilder();
        for (Participant participant : members) {
            Human human = (Human) participant;
            sb.append(human.getName()).append(", ");
        }
        System.out.println("Состав команды: " + sb);
    }

    public Participant[] showMass() {
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
