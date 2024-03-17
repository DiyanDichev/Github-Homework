package Day12_Defining_Classes_Exercises.P07;

public class Parents {
    private String parentName;
    private String parentBirthday;

    public Parents(String parentName, String parentBirthday) {
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }

    public String getParentName() {
        return parentName;
    }

    public String getParentBirthday() {
        return parentBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getParentName(), getParentBirthday());
    }
}