package Java_OOP_Exams.August2023Retake.handballTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Team {
    private String name;
    private int position;
    private Collection<HandballPlayer> handballPlayers;

    public Team(String name, int position){
        this.setPosition(position);
        this.setName(name);
        this.handballPlayers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException("Invalid name.");
        }
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    private void setPosition(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Invalid vacant position.");
        }
        this.position = position;
    }

    public int getCount() {
        return this.handballPlayers.size();
    }

    public void add(HandballPlayer handballPlayer){
        if (this.handballPlayers.size() == this.position){
            throw new IllegalArgumentException("Full team.");
        }
        this.handballPlayers.add(handballPlayer);
    }

    public void remove(String name) {
        HandballPlayer handballPlayer = this.handballPlayers.stream()
                .filter(f -> name.equals(f.getName()))
                .findAny()
                .orElse(null);
        if (handballPlayer == null){
            throw new IllegalArgumentException(String.format("A player named %s is not on the team.", name));
        }
        this.handballPlayers.remove(handballPlayer);
    }

    public HandballPlayer playerForAnotherTeam(String name){
        HandballPlayer handballPlayer = this.handballPlayers.stream()
                .filter(f -> name.equals(f.getName()))
                .findAny()
                .orElse(null);
        if (handballPlayer == null){
            throw new IllegalArgumentException(String.format("A player named %s is not on the team.", name));
        }
        handballPlayer.setActive(false);

        return handballPlayer;
    }

    public String getStatistics(){
        String names = this.handballPlayers.stream().map(HandballPlayer::getName).collect(Collectors.joining(", "));
        return String.format("The player %s is in the team %s.", names, this.name);
    }
}
