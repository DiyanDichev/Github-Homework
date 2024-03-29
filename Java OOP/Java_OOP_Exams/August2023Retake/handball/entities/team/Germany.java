package Java_OOP_Exams.August2023Retake.handball.entities.team;

public class Germany extends BaseTeam{

    public Germany(String name, String country, int advantage) {
        super(name, country, advantage);
    }

    public void play() {
        this.setAdvantage(this.getAdvantage() + 145);
    }
}
