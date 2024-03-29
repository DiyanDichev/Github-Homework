package Java_OOP_Exams.August2023Retake.handball.entities.team;

public class Bulgaria extends BaseTeam{

    public Bulgaria(String name, String country, int advantage) {
        super(name, country, advantage);
    }

    public void play(){
        this.setAdvantage(getAdvantage() + 115);
    }
}
