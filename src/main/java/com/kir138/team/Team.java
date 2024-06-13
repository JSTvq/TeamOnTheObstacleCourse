package com.kir138.team;

import java.util.Arrays;

public class Team {
    private final String nameTeam;
    private final Participant[] participants;

    public Team(String nameTeam, Participant... participants) {
        this.nameTeam = nameTeam;
        this.participants = participants;
    }

    //метод для вывода информации о членах команды, прошедших дистанцию
    public void showResults() {
        for (Participant participant : participants) {
            if (participant.getIsSuccessful()) {
                System.out.println(participant.getName() + " : winner");
            } else {
                System.out.println(participant.getName() + " : looser");
            }
        }
    }

    public Participant[] getParticipants() {
        return participants;
    }

    @Override
    public String toString() {
        return "Team{" +
                "nameTeam='" + nameTeam + '\'' +
                ", members=" + Arrays.toString(participants) +
                '}';
    }
}
