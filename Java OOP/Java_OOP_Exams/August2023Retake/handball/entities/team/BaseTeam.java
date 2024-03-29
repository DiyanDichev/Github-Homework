package Java_OOP_Exams.August2023Retake.handball.entities.team;


import Java_OOP_Exams.August2023Retake.handball.common.ExceptionMessages;

import static Java_OOP_Exams.August2023Retake.handball.common.ExceptionMessages.TEAM_ADVANTAGE_BELOW_OR_EQUAL_ZERO;
import static Java_OOP_Exams.August2023Retake.handball.common.ExceptionMessages.TEAM_COUNTRY_NULL_OR_EMPTY;

public abstract class BaseTeam implements Team{

    private String name;
    private String country;
    private int advantage;

    public BaseTeam(String name, String country, int advantage) {
        this.name = name;
        this.country = country;
        this.advantage = advantage;
    }

    @Override
    public String getName() {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.TEAM_NAME_NULL_OR_EMPTY);
        }
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAdvantage() {
        return this.advantage;
    }

    protected void setAdvantage(int advantage) {
        if (advantage <= 0) {
            throw new IllegalArgumentException(TEAM_ADVANTAGE_BELOW_OR_EQUAL_ZERO);
        }
        this.advantage = advantage;
    }

    public String getCountry() {
        return this.country;
    }

    private void setCountry(String country) {
        if (country == null || country.trim().isEmpty()) {
            throw new NullPointerException(TEAM_COUNTRY_NULL_OR_EMPTY);
        }
        this.country = country;
    }
}
