package Java_OOP_Exams.August2023Retake.handballTest;

public class HandballPlayer {
    private String name;
    private boolean isActive;

    public HandballPlayer(String name){
        this.setName(name);
        this.setActive(true);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }
}
