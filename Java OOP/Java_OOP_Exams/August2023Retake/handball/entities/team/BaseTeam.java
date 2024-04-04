package Java_OOP_Exams.August2023Retake.handball.entities.team;

import Java_OOP_Exams.August2023Retake.handball.common.ExceptionMessages;

public abstract class BaseTeam implements Team{

    private String name;
    private String country;
    private int advantage;

    public BaseTeam(String name, String country, int advantage) {
        this.setName(name);
        this.country = country;
        this.setAdvantage(advantage);
    }



    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.TEAM_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    abstract public void play();

    @Override
    public int getAdvantage() {
        return this.advantage;
    }

    public void setAdvantage(int advantage) {
        this.advantage = advantage;
    }
}
